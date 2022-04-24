package com.poly.part01.test05;

public class TvMain {

	public static void main(String[] args) {
		Tv lg = new Lg_Tv();
	
		
		System.out.println(lg.volUp());
		System.out.println(lg.volUp());
	

		System.out.println(lg.volDown());
		
		((Lg_Tv)lg).tvClosed();
		
		Samsung_Tv s =new Samsung_Tv();
		
		System.out.println(s.volUp());
		System.out.println(s.volUp());
		
		System.out.println(s.volDown());

		s.tvClosed();
		
	}

}
