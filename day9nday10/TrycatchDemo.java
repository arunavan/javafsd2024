package com.training.day9nday10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TrycatchDemo {

	public static void main(String[] args) {
		
		
		//try- with - multi catch
		
		int x[]= {3,4,5};
		int a, b, c;
		
		//C f=null;
		//try with resource, auto closeable
		//FileReader f;
		try( FileReader f=new FileReader("C:\\javaworkspace\\SampleApp1\\src\\com\\training\\day9nday10\\readme"); ) {
			
			// f=new FileReader("C:\\javaworkspace\\SampleApp1\\src\\com\\training\\day9nday10\\readme");
			a = 10;
			b = 2;
			c=a/b;
			System.out.println("result="+c);
			System.out.println(x[8]);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException |IOException e) {
			e.printStackTrace();
		}
		/*
		 * finally { try { f.close(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */
		System.out.println("done");

	}

}
