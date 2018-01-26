package com.csdn.strategy;

import java.util.Scanner;

public class Window {
	public static void main(String[] args) {
		double total = 0d;
		String isEnd = "y";
		Scanner scan = new Scanner(System.in);
		while (isEnd.equals("y")) {
			System.out.println("please enter number:");
			int numA = scan.nextInt();
			System.out.println("please enter prize:");
			int numB = scan.nextInt();
			total = (total + numA * numB);
			System.out.println("当前总价：" + total);
			System.out.println("继续添加（y/n）：");
			isEnd = scan.next();
		}
		CashContext cs = new CashContext("2");
		total = cs.getResult(total);
		System.out.println("折后总价：" + total);
	}
}
