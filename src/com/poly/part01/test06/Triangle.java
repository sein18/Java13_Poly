package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends Areaimpl{

	@Override
	public void make() {
		Scanner sc= new Scanner(System.in);
		System.out.print("�غ� : ");
		int x = sc.nextInt();
		System.out.print("���� : ");
		int y = sc.nextInt();
		
		double res = (x * y) / 2.0;
		
		setResult(String.format("%.2f", res));
	}
	
}
