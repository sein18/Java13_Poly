package com.poly.part01.test04;

public class Eagle extends Animal implements Bird{

	@Override
	public void bark() {
		System.out.println("�����");
	}

	@Override
	public void fly() { 
		System.out.println("�Ĵ��Ĵ�");
	}

}
