package com.training.day3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dept number");
		int deptno=sc.nextInt();  // 10 -it  20-ht  30-opertaions  40-infra 50-secuiry
		switch (deptno) {
		
		case 10:  {  System.out.println("IT"); break;    }
		case 20: {  System.out.println("HR"); break;    }
		case 30: {  System.out.println("OP"); break;    }
		case 40 :{  System.out.println("INFRA"); break;    }
		
		default :System.out.println("wrong dept number. does not exist");
		
		}
	}
}
