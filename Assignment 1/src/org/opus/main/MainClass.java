package org.opus.main;

import java.util.concurrent.Semaphore;

import org.opus.threadclass.MyThread;



public class MainClass {


	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(1);
		 
        MyThread mt1 = new MyThread(sem, "A"); 
        MyThread mt2 = new MyThread(sem, "B"); 
          
        // stating threads A and B 
        mt1.start(); 
        mt2.start(); 
          
        // waiting for threads A and B  
        mt1.join(); 
        mt2.join(); 
          
       
	}

}
