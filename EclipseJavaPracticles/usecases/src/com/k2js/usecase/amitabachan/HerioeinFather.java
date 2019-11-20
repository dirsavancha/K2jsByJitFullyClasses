package com.k2js.usecase.amitabachan;

public class HerioeinFather {

	public static void main(String[] args) {

		Abhishek abhi = new Abhishek();
		System.out.println(abhi.height);

		abhi.sportsTeam();
		abhi.awards();
		abhi.hitMovie();
		abhi.marriageOpinion();
		abhi.tvAdd();
//want to call parent class non static variable by creating Child class Object ,we can't call methods
		System.out.println(((Amitab) abhi).height);

		Amitab ami = new Abhishek();
		System.out.println("-------------");
		System.out.println(ami.height);
		ami.awards();
		ami.marriageOpinion();
		ami.hitMovie();
		ami.tvAdd();

	}

}
