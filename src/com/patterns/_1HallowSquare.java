package com.patterns;

public class _1HallowSquare {
	public static void pattern(int n) 
	{
		int i,j;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) 
			{
				if(i==0 || j==0 || i == n-1 || j == n-1) {
					System.out.print("8");
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}

	}
	public static void main(String[] args) {
		pattern(5);
	}
}
