package com.ruchika.chauhan.strategyPattern;

public class Match {

	public static void main(String[] args) {
		
		Player p=new Player(Strategy.T20);
		p.playOfEnum();
		
	}
}

class Player {
	private Strategy strategy;

	Player(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void playOfEnum() {
		strategy.play();
	}
}

enum Strategy {
	T20 {
		@Override
		public void play() {
			System.out.println("T20 MATCH started");
		}
	},
	ONEDAY {
		@Override
		public void play() {
			System.out.println("ONE DAY match Started");
		}
	},
	Test {
		@Override
		public void play() {
			System.out.println("TEST match Started");

		}
	};
	public void play() {
		// TODO Auto-generated method stub

	}
}