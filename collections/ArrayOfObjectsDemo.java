package com.training.day13.collections;

class Book{
	Integer id;
	String title;
	Double price;
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	public Book(Integer id, String title, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		Book books[]=new Book[5];  //array of objects
		
		//Book b1=new Book(1,"java",99.99);//single
		
		books[0]=new Book(1,"java",99.99);
		books[1]=new Book(2,"oracle",299.99);
		books[2]=new Book(3,"python",399.99);
		books[3]=new Book(4,"php",599.99);
		books[4]=new Book(5,"spring",899.99);
		
		System.out.println(books);
		/*
		for(int i=0;i<books.length;i++)
			System.out.println(books[i]);
		*/
		
		for(Book b:books)
			System.out.println(b);
	
	}

}
