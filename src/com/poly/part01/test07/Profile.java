package com.poly.part01.test07;

public class Profile {
	//�ʵ�
	private String name;
	private String phone;
	
	//������
	public Profile() { }
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//�޼ҵ�
	public void printProfile() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
	}
	
	
	
}
