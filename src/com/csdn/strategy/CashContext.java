package com.csdn.strategy;

public class CashContext {
	private CashSuperStrategy cashSuperStrategy;

	public CashContext(String type) {
		switch (type) {
		case "1":
			cashSuperStrategy = new CashNormal();
			break;
		case "fl":
			cashSuperStrategy = new CashReturn("300", "100");
			break;
		case "2":
			cashSuperStrategy = new CashRebate("0.8");
			break;
		}
	}

	public double getResult(double money) {
		return cashSuperStrategy.acceptCash(money);
	}
}
