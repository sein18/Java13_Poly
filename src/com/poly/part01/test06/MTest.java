package com.poly.part01.test06;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택해 주세요.[1:원 2:삼각형 3: 사각형]");
		int select = sc.nextInt();

		Areaimpl c = null;
		switch (select) {
		case 1:
			c = new Circle();
			break;
		case 2:
			c = new Triangle();
			break;
		case 3:
			c = new Square();
			break;
		}
		
		c.make();
		c.print();
	}

}
