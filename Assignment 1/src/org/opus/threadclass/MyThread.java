package org.opus.threadclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

import org.opus.arithmaticservices.ArithmeticOperations;
import org.opus.consumers.FileInput;
import org.opus.servicesproducer.ArithmeticImplementation;



public class MyThread extends Thread
{
	Semaphore sem;
	String threadName;
	Scanner sc = new Scanner(System.in);
	static List<Integer> list1 = new ArrayList<>();
	static List<Integer> list2 = new ArrayList<>();
	static List<Integer> result = new ArrayList<>();
	 public MyThread(Semaphore sem, String threadName)  
	    { 
	        super(threadName); 
	        this.sem = sem; 
	        this.threadName = threadName; 
	    } 
	  
	    @Override
	    public void run()
	    { 
	    	FileInput f1 = new FileInput();
	    	String ch = "y" ;
	    	list1 = f1.getList1();
	    	System.out.println(list1);
	    	list2 = f1.getList2();
	    	System.out.println(list2);
	        // run by thread A 
	        if(this.getName().equals("A")) 
	        { 
	            System.out.println("-----Starting " + threadName + "-----"); 
	            try 
	            { 
	                // First, get a permit. 
	                System.out.println(threadName + " is waiting for a resource."); 
	              
	                // acquiring the lock 
	               // if(ch == "y")
	                	sem.acquire(); 
	              
	                System.out.println(threadName + " gets a resource."); 
	          
	                
	               
	                ArithmeticOperations ai = new ArithmeticImplementation();
	               
	                /*result = ai.addition(list1, list2);
	                System.out.println("Addition of two lists: " + result);
	                float avg = ai.average(list2);
	                System.out.println("Average of one list: "+ avg);
	                result = ai.substraction(list1, list2);
	                System.out.println("Substraction of two lists " + result);*/
	                
	                
	                while(ch == "y")
	                {
	                	int choice = 0;
	                	System.out.println("-+-+-+Arithmetic Operations-+-+-+");
	                	System.out.println("1. Addition");
	                	System.out.println("2. Substraction");
	                	System.out.println("3. Multiplication");
	                	System.out.println("4. Average");
	                	System.out.println("5. Divide");
	                	System.out.println("6. Modulus");
	                	System.out.println("Please enter your choice:   ");
	                	choice = sc.nextInt();
	                	
	                	switch(choice)
	                	{
	                		case 1:
	                			result = ai.addition(list1, list2);
	                		   System.out.println("Addition of two lists: " + result);
	                		   break;
	                		
	                		case 2:
	                			result = ai.substraction(list1, list2);
	        	                System.out.println("Substraction of two lists " + result);
	        	                break;
	        	                
	                		case 3:
	                			result = ai.multiply(list1, list2);
	                			System.out.println("Multiplication of two lists "+ result);
	                			break;
	                			
	                		case 4:
	                			 float avg = ai.average(list2);
	         	                System.out.println("Average of one list: "+ avg);
	         	                break;
	         	                
	                		case 5:
	                			result = ai.divide(list1, list2);
	                			System.out.println("Division result of two lists: "+ result);
	                			break;
	                			
	                		case 6:
	                			result = ai.modulus(list1, list2);
	                			System.out.println("Modulus of two lists: " + result);
	                			break;
	                			
	                		default:
	                			System.out.println("Invalid choice");
	                		   break;
	                	}
	                	
	                	System.out.println("Do you want to continue: y/n?");
	                	ch = sc.next();
	                	
	                	if(ch == "n")
	                		System.out.println(threadName + " releases the resource."); 
	                		sem.release(); 
	                			
	                }
	                
	            } catch (InterruptedException exc) { 
	                    System.out.println(exc); 
	                } 
	          
	                 
	                
	        } 
	          
	        // run by thread B 
	        else
	        { 
	        	System.out.println("-----Starting " + threadName + "-----");  
	            try 
	            { 
	            	
	                System.out.println(threadName + " is waiting for resource."); 
	              
	                // acquiring the lock 
	                //if(ch == "y")
	                	sem.acquire(); 
	              
	                System.out.println(threadName + " gets a resource."); 
	          
	               
	                
	                /*ArithmeticOperations ai = new ArithmeticImplementation();
		               
	                result = ai.addition(list1, list2);
	                System.out.println("Addition of two lists: " + result);
	                float avg = ai.average(list1);
	                System.out.println("Average of one list: "+ avg);
	                result = ai.substraction(list1, list2);
	                System.out.println("Substraction of two lists " + result);*/
	                
	                ArithmeticOperations ai = new ArithmeticImplementation();
	                
	                while(ch == "y")
	                {
	                	int choice = 0;
	                	System.out.println("-+-+-+Arithmetic Operations-+-+-+");
	                	System.out.println("1. Addition");
	                	System.out.println("2. Substraction");
	                	System.out.println("3. Multiplication");
	                	System.out.println("4. Average");
	                	System.out.println("5. Divide");
	                	System.out.println("6. Modulus");
	                	System.out.println("Please enter your choice:   ");
	                	choice = sc.nextInt();
	                	
	                	switch(choice)
	                	{
	                		case 1:
	                			result = ai.addition(list1, list2);
	                		   System.out.println("Addition of two lists: " + result);
	                		   break;
	                		
	                		case 2:
	                			result = ai.substraction(list1, list2);
	        	                System.out.println("Substraction of two lists " + result);
	        	                break;
	        	                
	                		case 3:
	                			result = ai.multiply(list1, list2);
	                			System.out.println("Multiplication of two lists "+ result);
	                			break;
	                			
	                		case 4:
	                			 float avg = ai.average(list2);
	         	                System.out.println("Average of one list: "+ avg);
	         	                break;
	         	                
	                		case 5:
	                			result = ai.divide(list1, list2);
	                			System.out.println("Division result of two lists: "+ result);
	                			break;
	                			
	                		case 6:
	                			result = ai.modulus(list1, list2);
	                			System.out.println("Modulus of two lists: " + result);
	                			break;
	                			
	                		default:
	                			System.out.println("Invalid choice");
	                		   break;
	                	}
	                	
	                	System.out.println("Do you want to continue: y/n?");
	                	ch = sc.next();
	                	
	                	if(ch == "n")
	                		System.out.println(threadName + " releases the resource."); 
	                		sem.release();
	                			
	                }
	                
	                
	                
	                
	            } catch (InterruptedException e) { 
	                    System.out.println(e); 
	                } 
	                // Release the permit. 
	                 
	        } 
	    }
}
