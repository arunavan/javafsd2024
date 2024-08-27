package com.training.day9;

public class ExDemo1 {

	public static void main(String[] args) {
		try {
			  int x[]= {4,5,6};
			  System.out.println(x[2]);//0,1,2,3,4
			  int a=10,b=5,c;
				c=a/b;
				System.out.println("REsult:"+c);
				String s="java";
				System.out.println(s.length());
				
		}
	   catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(Exception e2) {
			e2.printStackTrace();
		}

		System.out.println("Done");
		
	//	String s=null;
		//System.out.println(s.length());
		
	}

}
