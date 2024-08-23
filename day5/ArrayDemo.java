package com.training.day5;

import java.util.Scanner;

class Course{
	Integer id;
	String name;
	Integer duration;
	public Course(Integer id, String name, Integer duration) {
		
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	void dispCourseDetails() {
		System.out.println(id+"  "+name+"  "+duration);
	}
}


public class ArrayDemo {

	public static void main(String[] args) {
		//declare   {3,4,2,5,6,7,8,9,6,7};//
		int marks[]=new int[10];// same name, continuos memory , read , write
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("enter array elements ");
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextInt();
		*/
		//for(int i=0;i<marks.length;i++)
			//System.out.println(marks[i]);
		
		System.out.println("for each loop");
		for(int x:marks)
			System.out.println(x);
		
		String names[]=  {"ram","raj","amith","john"};//4
		
		//for(int i=0;i<names.length;i++)
			//System.out.println(names[i]);
		
		for(String s:names)
			System.out.println(s);
		
		//Double scores[]=new Double[5];
		//Float ids[]=new Float[100];
		
		
		Course courses[]=new Course[3];
		courses[0]=new Course(101,"java",3);
		courses[1]=new Course(102,"jee",3);
		courses[2]=new Course(103,"Angular",2);
		
		System.out.println(courses);
		for(Course c:courses)
			//System.out.println(c);
			c.dispCourseDetails();
	
		
		

	}

}
