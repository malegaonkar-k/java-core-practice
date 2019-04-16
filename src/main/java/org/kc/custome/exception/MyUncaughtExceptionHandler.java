package org.kc.custome.exception;
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
  public void uncaughtException(Thread t, Throwable e) {
	  System.out.println("Thread : "+ t);
	  System.out.println("exception : "+ e.getClass());
     System.out.println(" handled without try catch");
   }
}