package com.patterns;

public class _2NumberTriangle {
	public static void pattern(int n) 
	{
		int i,j;
		// number of rows
		for(i=0; i<=n; i++) {
			for(j=0; j<= n-i; j++) 
			{
				System.out.print(" ");
			}
			for(j=0; j<= i ; j++) {
				System.out.print(i +" ");
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		pattern(5);
	}
}
