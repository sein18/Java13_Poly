package com.poly.part01.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.println("���� [1:����� 2:�۸��� 3:�۾���]");
		Scanner sc =new Scanner(System.in);
		int select = sc.nextInt();
		
		Base base = null;

		switch (select) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
		}
		
		base.start();
		base.stop();
	}

}
