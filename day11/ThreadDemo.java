package com.training.day11;

//import java.lang.Thread;
class T1 extends Thread{  //child thread/ custom thread
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	}
}
public class ThreadDemo {//JVM
	public static void main(String[] args) //throws InterruptedException
	{   T1 t=new T1();
		t.setName("Producer");
		t.start();  //need start
		
		T1 t2=new T1();
		t2.setName("Consumer");
		
		System.out.println(t2.getName()+"   "+t2.getId());
		t2.setPriority(1);   //1  5   10
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t2.getPriority());
		t2.start();
		
		//t2.suspend();
		//t2.resume();
		
		//t2.interrupt();
		//t2.isInterrupted()
		
		//t2.stop();
		//t2.yield();
		
		
		
		
		System.out.println(Thread.activeCount());
		for(int i=0;i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	//	Product p=new Product(); //
		 
		

	}

}
