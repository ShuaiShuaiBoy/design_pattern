package com.csdn.strategy;

public class CashNormal extends CashSuperStrategy {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
