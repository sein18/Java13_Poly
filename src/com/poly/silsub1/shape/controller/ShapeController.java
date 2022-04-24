package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Shape;
import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeController {
	public void calcShape() {
		Shape s;
		
		s = new Circle(15.5);
		System.out.printf("�� ����: %.2f\n",s.area()); 
		System.out.printf("�� �ѷ�: %.2f\n",s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.printf("�簢�� ����: %.2f\n",s.area()); 
		System.out.printf("�簢�� �ѷ�: %.2f\n",s.perimeter());
		
		s = new Triangle(12.3, 11.2);
		System.out.printf("�ﰢ�� ����: %.2f\n",s.area()); 
		System.out.printf("�ﰢ�� �ѷ�: %.2f\n",s.perimeter());
		
	}

	public void calcShapeArr() {
		Shape arr[] = new Shape[5];

		arr[0] = new Circle(13.2);
		arr[1] = new Triangle(12.4, 21.0);
		arr[2] = new Rectangle(11.3, 21.5);
		arr[3] = new Circle(5.12);
		arr[4] = new Triangle(22.1, 10.5);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("����: %.2f\n", arr[i].area());
			System.out.printf("�ѷ�: %.2f\n", arr[i].perimeter());
		}
	}
}
