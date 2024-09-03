package com.training.day12.io;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product   implements Externalizable   {//implements Serializable{
	Integer id;
	String name;
	static String city="hyderabad";
	transient  int temp=90;
	Product(){
		
	}
	public Product(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void readExternal (ObjectInput stream)  throws IOException {
		this.id=stream.readInt();
		
	}
	@Override
    public void writeExternal (ObjectOutput stream) throws IOException {
    	stream.writeInt(this.id+10);
    	
    	
    }

	
}
//sender
public class SerilizationDemo {

	public static void main(String[] args) throws IOException{
		Product p=new Product(101,"Box"); //file
		
		//serialization
		FileOutputStream f=new FileOutputStream("C:\\Users\\VINOD\\Downloads\\Javatraining\\serial1");// 
		ObjectOutputStream o1=new ObjectOutputStream(f);
		o1.writeObject(p);
		System.out.println(" serialization is done");
				

	}

}
