package com.training;

public class Demo2 {
//byte, short,long,float,int,double 
	//char, boolean

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		double b=a;//implicit   , widening
		
		
		double x=23423432.123;
		int y=(int)x;  //explicit, narrowing 
		
		System.out.println(a+  "  "  +b  +"  "+x  +"  "+y);
		
		String address="hyd,telanga,india";
		System.out.println(address);    //sysout+ctl spacebar
		
		int marks[]= {78,56,89};
		System.out.println(" for loop==========");
		for(int i=0;i<marks.length;i++)
			System.out.println(marks[i]);
		System.out.println(" enhanced for loop==========");
		
		for(int x2:marks)
			System.out.println(x2);
			
		int scores[]=new int[5];//0..4
		scores[0]=23;
		scores[1]=34;
		scores[2]=67;
		for(int x1:scores)
			System.out.println(x1);
	}
}
