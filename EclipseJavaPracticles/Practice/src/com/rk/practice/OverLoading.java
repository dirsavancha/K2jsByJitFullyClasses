package com.rk.practice;

public class OverLoading {

	public void m1(int a, float b) {
		System.out.println(a + b);
	}

	/*
	 * public void m1(float a, int b) { System.out.println(a + b); }
	 */

	public void m1(float a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.m1(1, 2);
	}

}
