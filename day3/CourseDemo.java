package com.training.day3;

//business 
class Course{
	Integer id;
	String name;
	Integer duration;
	void readData() {
		id=101;
		name="java";
		duration=2;
	}
	void printData() {
		System.out.println(id +"  "+ name+"  "+duration);
		
	}
}

class Student{
	Integer id;
	String name;
	void read() {
		id=102;
		name="ram";
		}
	void show() {
		System.out.println(id+  "  "+name);
	}
}
// run, test,client
public class CourseDemo {
	public static void main(String[] args) {
		Course c=new Course();  //instantiation, object
		c.readData();
		c.printData();
		
		
		Student s=new Student();
		s.read();
		s.show();
		
		

	}

}
