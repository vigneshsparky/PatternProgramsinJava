package com.patterns;

public class _3NumberIncreasingPyramid {
	public static void main(String[] args) {
		int n = 5;
		int i,j;
		
		for(i = 1; i<=n; i++) 
		{
			for(j=0; j<i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
