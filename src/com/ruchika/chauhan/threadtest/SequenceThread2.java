package com.ruchika.chauhan.threadtest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class one implements Runnable{
    CyclicBarrier cb;
    one(CyclicBarrier cb){this.cb=cb;}
    public void run(){
        int i=1;
        while(i<20)
        {
            System.out.println(i);
            try {
              //  Thread.sleep(1000);
                cb.await();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            i=i+3;
        }
    }

}
class two implements Runnable{
    CyclicBarrier cb;
    int i=2;
    two(CyclicBarrier cb){this.cb=cb;}
    public void run(){


        System.out.println(i);
        try {
            cb.await();
            i=i+3;
        //    Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


public class SequenceThread2 {
    public static void main(String args[]){
        Runnable threePrinter = new Runnable() {
            int i=3;
            public void run() {
                System.out.println(i);
                i=i+3;
            }
        };


        CyclicBarrier bar2 =new CyclicBarrier(1,threePrinter);//, barrier1Action);
        two twoPrinter  =new two(bar2);
        CyclicBarrier bar1 =new CyclicBarrier(1,twoPrinter);

        Thread onePrinter=new Thread(new one(bar1));
        onePrinter.start();
    }
}