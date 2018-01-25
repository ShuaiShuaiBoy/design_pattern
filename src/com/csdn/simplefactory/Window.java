package com.csdn.simplefactory;

import java.util.Scanner;

public class Window {
	public static void main(String[] args) {
		try {
			Operation oper = new Operation();
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter first number:");
			double numA = scan.nextInt();
			oper.setNumA(numA);
			System.out.println("please enter the operator:");
			String op = scan.next();
			System.out.println("please enter second number:");
			double numB = scan.nextInt();
			oper.setNumB(numB);
			System.out.println("the equation result is:");
			System.out.println(OperationFactory.createOperate(op).getResult(oper));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
