package com.poly.part01.test06;

import java.util.Scanner;

public class Square extends Areaimpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ� �Է�: ");
		int x = sc.nextInt();
		System.out.print("���� �Է�: ");
		int y = sc.nextInt();

		int res = x * y;
		
		setResult(String.valueOf(res));
	}
	
	@Override
	public void print() {
		System.out.print("�簢���� " );
		super.print();
	}

}
