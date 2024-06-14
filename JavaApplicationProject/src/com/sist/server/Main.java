package com.sist.server;
class MyThread extends Thread{
//	Thread 사용시 반드시 run메소드 안에서 어떻게 동작할지 구현해야 함
	public void run() {
		try {
			for(int i=1; i<=10; i++){
				System.out.println(i+":"+getName());
				Thread.sleep(200);
			}
		}catch(Exception ex) {}
	}
}
public class Main {

	public static void main(String[] args) {
		MyThread m1 = new MyThread(); //thread 0
		MyThread m2 = new MyThread(); //thread 1
		MyThread m3 = new MyThread(); //thread 2
		
		m1.start();
		m2.start();
		m3.start();
	}

}
