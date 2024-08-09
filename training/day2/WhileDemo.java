package com.training.day2;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int start=sc.nextInt();  //5   10  50 5000
		int end=sc.nextInt();
		int i=start;
		while (i<=end) {
			System.out.println( i);  //1 
			i+=2;
		}
		
		
		
	}
}
