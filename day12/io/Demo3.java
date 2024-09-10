package com.training.day12.io;

import java.io.File;
import java.io.FileReader;

public class Demo3 {

	public static void main(String[] args) {
		File f1=new File("C:\\Users\\VINOD\\Downloads\\Javatraining\\readme.txt");
		System.out.println(f1.isFile()+ "  "+f1.isDirectory());
		System.out.println(f1.exists());
		
		
		File f2=new File("C:\\Users\\VINOD\\Downloads\\Javatraining\\GIT");
		String names[]=null;
		if(f2.isDirectory()) {
			 names=f2.list();
		}
		System.out.println(" file list in given folder ");
		for( String name:names)
			System.out.println(name);
		
	}

}
