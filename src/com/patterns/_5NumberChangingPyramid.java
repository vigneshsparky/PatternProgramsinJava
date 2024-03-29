package com.patterns;

public class _5NumberChangingPyramid {
	public static void main(String[] args) {
		int i,j;
		int num = 1;
		int n =6;
		
		for(i=1; i<=n; i++) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
}
