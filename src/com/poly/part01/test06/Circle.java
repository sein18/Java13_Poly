package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends Areaimpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int r = sc.nextInt();

		double res = r * r * Math.PI;
		
		
		//super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}
	
	@Override
	public void print() {
		System.out.print("���� ");
		super.print();
	}

}
