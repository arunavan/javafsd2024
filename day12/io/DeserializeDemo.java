package com.training.day12.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeDemo {



		public static void main(String[] args) throws IOException,ClassNotFoundException{
				
			//DEserialization
			FileInputStream f=new FileInputStream("C:\\Users\\VINOD\\Downloads\\Javatraining\\serial2");// 
			ObjectInputStream o1=new ObjectInputStream(f);
			Product p1=(Product)o1.readObject();
			System.out.println(" DEserialization is done");
			System.out.println(p1);
					

		}

	}