package com.javaintroduction;

public class Movie {
	int movieId;
	String movieName;
	static String industryName;
	

	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.movieId=101;
		m1.movieName="pushpa";
		System.out.println(m1.movieId);
		System.out.println(m1.movieName);
		m1.industryName="Tollywood";
		System.out.println(m1.industryName);
		
		Movie m2=new Movie();
		m2.movieId=102;
		m2.movieName="RRR";
		System.out.println(m2.movieId);
		System.out.println(m2.movieName);
		m2.industryName="Tollywood";
		System.out.println(m2.industryName);
		
		Movie m3=new Movie();
		m3.movieId=103;
		m3.movieName="peddi";
		System.out.println(m3.movieId);
		System.out.println(m3.movieName);
		m3.industryName="Tollywood";
		System.out.println(m3.industryName);
		
		Movie m4=new Movie();
		m4.movieId=104;
		m4.movieName="sholay";
		System.out.println(m4.movieId);
		System.out.println(m4.movieName);
		m4.industryName="bollywood";
		System.out.println(m4.industryName);
		
		
		
		

	}

}
