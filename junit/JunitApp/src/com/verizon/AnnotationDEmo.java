package com.verizon;

import java.util.Date;


class A
{	void show() {
	}

	//@Override
	public String toString() {
		return "A [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

class B extends A{
	@Override
	void show() {
		
	}
}
public class AnnotationDEmo {

	@SuppressWarnings(value = {  "deprecation" })
	void show() {
		
		Date d=new Date();
		//LocalDate
		System.out.println(d.getDate());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
