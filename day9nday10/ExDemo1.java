package com.training.day9nday10;

import java.io.FileReader;
import java.io.IOException;

public class ExDemo1 {

	public static void main(String[] args) {
		FileReader f=null;
		try {//raise
			try {
				String s=null;
				System.out.println(s.length());
			}
			catch (Exception e) {
					e.printStackTrace();
			}
			 f=new FileReader("C:\\javaworkspace\\SampleApp1\\src\\com\\training\\day9nday10\\readme");
			 
			  try {
				int x[]= {4,5,6};
				  System.out.println(x[6]);//0,1,2,3,4
			} catch (Exception e) {
				e.printStackTrace();
			}
			  int a=10,b=0,c;
				c=a/b;
				System.out.println("REsult:"+c);
					
		}
	   catch (ArrayIndexOutOfBoundsException e) {  //catch, display 
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
    finally{
    	     
				try {
					f.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		System.out.println("Done");
    }
		
	//	String s=null;
		//System.out.println(s.length());
		
	}

}
