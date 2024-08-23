package com.training.day5;

import java.util.Arrays;

class Employee{
	Integer id;
	String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	void disp() {
		System.out.println(id+"  "+name);
	}
	
	
}

public class EmployeearrayDemo {
	public static void main(String[] args) {
		Employee e[]=new Employee[5];
		e[0]=new Employee(10,"raj");
		e[1]=new Employee(11,"ram");
		e[2]=new Employee(12,"amith");
		e[3]=new Employee(13,"ram123");
		e[4]=new Employee(14,"amith123");
		
		for(Employee x:e)
			//x.disp();
			System.out.println(x);
		
		
		int eid[]= {234,765,897,567,453};
		for(int x:eid)
		System.out.println(x);
		Arrays.sort(eid);
		for(int x:eid)
			System.out.println(x);
		
		int source[]= {3,2,4,5,6,1,7,8,9};
		int target[]=new int[5];
		
		System.arraycopy(source, 3, target, 0, 5);
		System.out.println();
		for(int x:source)
			System.out.print(x+"  ");
		System.out.println();
		for(int x:target)
			System.out.print(x+"  ");
		
		
		
		

	}

}
