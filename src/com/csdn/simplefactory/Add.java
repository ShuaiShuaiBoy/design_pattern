package com.csdn.simplefactory;

public class Add extends Operation {
	@Override
	public double getResult(Operation op) {
		double result = 0;
		result = op.getNumA() + op.getNumB();
		return result;
	}
}
