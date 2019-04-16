package org.kc.threds;

public class MyThread extends Thread{

	public MyThread() {

	}

	public MyThread(String string) {
		this.setName(string);
	}

	public void run(){
		for(int i=0; i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" running");
		}
		System.exit(0);
	}

}
