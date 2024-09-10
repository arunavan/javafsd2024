package com.training.day12.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\VINOD\\Downloads\\Javatraining\\links.txt");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\VINOD\\Downloads\\Javatraining\\linksoutput.txt");
		int k=0;
		
		while((k=f1.read())!=-1) {
			
			System.out.print((char)k);
			f2.write((char)k);
		}
		
		f1.close();
		f2.close();
	
	}

}
