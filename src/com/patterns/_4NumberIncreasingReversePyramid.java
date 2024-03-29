package com.patterns;

public class _4NumberIncreasingReversePyramid {
	public static void main(String[] args) {
		int n=6;
		int i,j;
		for(i=n; i>=1; i--) {
			for(j=0; j<i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
