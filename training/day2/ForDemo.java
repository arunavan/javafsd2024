package com.training.day2;

import java.util.Scanner;

public class ForDemo {
	void printTable(int n) {
		for(int i=1;i<=10;i++)
			System.out.println(n + "X"  + i + " = "+ n*i);
		
		
	}
	//function with return type
	
	int addNum(int a,int b){
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table number");
		int t=sc.nextInt();  
		ForDemo fd=new ForDemo();
		fd.printTable(t);
		
		System.out.println("sum="+fd.addNum(2, 6));
		int s=fd.addNum(10, 20);
		System.out.println("sum="+s);

	}

}
