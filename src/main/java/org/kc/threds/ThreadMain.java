package org.kc.threds;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;import java.util.concurrent.TimeUnit;


public class ThreadMain {
	public static void main(String[] s){
		//	Collections.sort(new HashSet());
		System.out.println("Hi");
		System.out.println(Thread.currentThread());
		ExecutorService exe=Executors.newSingleThreadExecutor();
		exe.submit(()->{
			for(int i=0;i<5;i++){
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+" => "+i);
			}
		});
		/*
		 * 
		 * 
	Thread d=new Thread(
			()->{
				for(int i=0;i<5;i++){
					if(i>3){
					//	Thread.currentThread().interrupt();

					}
				 try {
					Thread.sleep(3000);
					TimeUnit.SECONDS.sleep(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread "+Thread.currentThread());
				}
			}
			);
	//d.setDaemon(true);
	System.out.println(d.isDaemon());

	d.start();
	try {
		d.sleep(5000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
			e.printStackTrace();
	}

	Runnable r=()->{

		System.out.println("thread runnable lambda"+Thread.currentThread());
	};

	Thread t=new Thread(r);
	t.start();

		 */
		/*
	try {
		Thread.currentThread().join(); //will tell main thread to wait for this thread to die(wait for this thread to die).
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 */

		/* 
		 * Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	MyThread t=new MyThread();
	t.start();
	System.out.println(Thread.currentThread());
	System.out.println(Thread.activeCount());
	System.out.println(Thread.getAllStackTraces());
	//System.out.println(Thread.dumpStack());
	System.out.println(Thread.currentThread().getState());

	try {
		Thread.currentThread().sleep(1000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
		 */
		// MyThread t1=new MyThread("some_name");
		// t1.start();
	}
}












