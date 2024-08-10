package com.training.day3;

import java.util.Scanner;

public class DoWhileDemo {
	
	void printNum(int n) {
		System.out.println("numbers using do while");
		int i=1;
		do {
		    System.out.println("Number :"+i);
		    i++;
		}while(i<=n);//post conditional
		
	}
	public static void main(String[] args) {
		DoWhileDemo obj=new DoWhileDemo(); //instance, orbject,ref
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();  
	     obj.printNum(n);
	     
	     obj.printNum(99);

	}

}
