package com.csdn.simplefactory;

public class OperationFactory {
	public static Operation createOperate(String op) {
		Operation oper = null;
		switch (op) {
		case "+":
			oper = new Add();
			break;
		case "-":
			oper = new Sub();
			break;
		case "*":
			oper = new Mul();
			break;
		case "/":
			oper = new Div();
			break;
		}
		return oper;
	}
}
