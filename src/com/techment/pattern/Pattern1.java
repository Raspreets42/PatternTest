package com.techment.pattern;

public class Pattern1{
	public static void main(String[] args) {
		
		int row=3 , col=3;
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}