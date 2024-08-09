package com.training.day2;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		//if - conditional
		
		if(a<100)
		{   if(a%2==0) {
			        System.out.println("Even");
		      }
	    	else  {System.out.println("Odd");
			
		     }
			System.out.println("within the range");
		}
		else
			System.out.println("out of range");
		

	}

}
