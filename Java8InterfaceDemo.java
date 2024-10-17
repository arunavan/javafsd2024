package com.training.day8;

interface Arith {
	int add(int a,int b);
	int product(int a,int b);
	//int getName();
	
	 default String getMessage() {
		 return "welcome";
	 }
	 
	 static void getAddress() {
		 System.out.println("Hyderabda,India");
	 }
	
}

interface Calc extends Arith{
	int sq(int x);
	@Override
	default String getMessage() {
		return "Welcome to FSD";
	}
	
	static void getCity() {
		System.out.println("Chennai");
	}
}
class ArithImpl implements Arith,Calc{
	public int add(int a,int b) {
		return a+b;
	}
	
	 public int product(int a,int b) { 
		 return a*a+b*b; 
		 }
	 public int sq(int x) {
		 return x*x;
	 }
	
	
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
	
		Arith a=new ArithImpl();
		System.out.println(a.add(4, 5));
		System.out.println(a.product(4, 5));
		
		System.out.println(a.getMessage());

		Calc c=new ArithImpl();
		System.out.println(c.sq(5));
		System.out.println(c.getMessage());  //default, abstract
		
		Arith.getAddress();  //static
		Calc.getCity();  //static
	}

}
