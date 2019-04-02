package com.ruchika.chauhan.threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SeqThread {

    public static void main(String[] arg) {
          new SeqThread().execute();
    }

    public void execute() {
        try {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(R);
        executor.submit(R2);
        executor.shutdown();

            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    Runnable R = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for(int i=0;i<3;i++)
            {
                System.out.println("In Thread One "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable R2 = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for(int i=0;i<3;i++)
            {
                System.out.println("In Thread Two="+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    };
}
