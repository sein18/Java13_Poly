package com.poly.part01.test04;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("�߿�");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed + "�� ����̰� �Դ´�.!");
	}
}
