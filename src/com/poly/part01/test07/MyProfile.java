package com.poly.part01.test07;

public class MyProfile extends Profile implements Display, Job {
	private String loc;
	
	
	public MyProfile() { }
	public MyProfile(String name, String phone) {
		super(name, phone); 
	}

	@Override
	public void jobLoc(String loc) {
		this.loc = loc;

	}

	@Override
	public void Display() { 
		super.printProfile();
		System.out.println("ȸ�� �ּ�: " + loc);
		System.out.println("ȸ�� ����: " + jobId);
	}
	
}
