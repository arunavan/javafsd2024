package com.training.day9nday10;

import java.io.FileNotFoundException;
import java.io.FileReader;

class X{
	void disp() throws InterruptedException,FileNotFoundException
	{
		CheckedDemo ch=new CheckedDemo();
		ch.show();
	}
}

public class CheckedDemo {
	
	//try-catch   - unchecked, runtime
	//throws     - checked, compiletime
	void show()  throws InterruptedException,FileNotFoundException
	{
		Thread.sleep(500);
		//String s=null;
		//System.out.println(s.concat("language"));
		
		FileReader f=new FileReader("C:\\javaworkspace\\SampleApp1\\src\\com\\training\\day9nday10\\readme"); 

	}

	public static void main(String[] args)    throws InterruptedException,FileNotFoundException
	{
		
		CheckedDemo ch=new CheckedDemo();
		ch.show();
		
		//Thread.sleep(500);   //compiletime, checked
		
		//FileReader f=new FileReader("C:\\javaworkspace\\SampleApp1\\src\\com\\training\\day9nday10\\readme"); 

	}

}
