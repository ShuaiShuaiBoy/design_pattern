package com.csdn.strategy;

public class CashRebate extends CashSuperStrategy {

	public double moneyRebate = 1d;

	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * moneyRebate;
	}

}
