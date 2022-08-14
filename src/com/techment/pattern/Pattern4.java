package com.techment.pattern;

public class Pattern4{
	public static void main(String[] args) {
		
		int table_name=3 , limit=15;
		int count = 1;
		for(int i = 1 ; i <= limit ; i++) {
			System.out.println( table_name + " * " + i + " = " + table_name*i  );
		}
	}
}