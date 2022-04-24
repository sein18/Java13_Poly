package com.poly.part01.test05;

public class Samsung_Tv implements Tv{
	
	private int vol;

	// 생성자
	public Samsung_Tv() {
		System.out.println("Samsung TV가 켜졌습니다.");
	}

	// getter&setter
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int volUp() {
		setVol(getVol()+3);
		return getVol();
	}
	@Override
	public int volDown() {
		vol = vol - 3;
		return vol;
	}
	
	public void tvClosed() {
		System.out.println("Samsung tv가 꺼졌습니다.");
	}
}
