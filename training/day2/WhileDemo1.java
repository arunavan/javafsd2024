package com.training.day2;

import java.util.Scanner;

public class WhileDemo1 {
	//user defined , user
	void printTable(int t) {  //sub program , function , method 
		int i=1;
		while(i<=10) {
			System.out.println(t + "X"  + i + " = "+ t*i);
			i++;
		}
	}
	
	//function with void , no return type
	void sayHello(String name) {
		System.out.println(" Hello  "+name);
	}
	
	
	public static void main(String[] args) { //JVM
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter table number");
		//int t=sc.nextInt(); 
		WhileDemo1  obj=new WhileDemo1();   //calling function
		//obj.printTable(t);
		//obj.printTable(15);
		//obj.printTable(20);
		
		obj.sayHello("Java SDE");
		obj.sayHello("Shyamala");
		
		
	}

}
