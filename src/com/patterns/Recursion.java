package com.patterns;

public class Recursion {
	public static void main(String[] args) {
		recursion(0);
	}
	
	public static void recursion(int n) {
		if(n == 10) {
			System.out.println("10");
		}else {
			System.out.println(n);
			recursion(n+1);
		}

	}
}
