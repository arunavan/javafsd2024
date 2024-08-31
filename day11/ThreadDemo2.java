package com.training.day11;
public class ThreadDemo2  implements Runnable{ //run()
		public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	}
	public static void main(String[] args) {
		ThreadDemo2 t=new ThreadDemo2();
		Thread tt=new Thread(t);
		tt.start();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		
	}

}
