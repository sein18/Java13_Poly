package com.poly.part01.test06;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �ּ���.[1:�� 2:�ﰢ�� 3: �簢��]");
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
