
/*
 * Author : Arpita Bhalerao
 * Version : 1.0 
 * Description : Consumer class which will access the arithmetic operations methods
 */
package org.opus.consumers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;


public class FileInput 
{

	
	
	static List<Integer> list1 = new ArrayList<>();
	static List<Integer> list2 = new ArrayList<>();
	public FileInput()
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		String line = null;
		Scanner sc = null;
		Scanner sc1 = null;
		int flag = 0;
		try {
			br = new BufferedReader(new FileReader("Input.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			while((line = br.readLine()) != null)
			{
				List<Integer> list3 = new ArrayList<>();
				//System.out.println(line);
				
				sc = new Scanner(line);
				sc.useDelimiter(",");
				int i = 0;
				while(sc.hasNext())
				{
					/*String temp = sc.next();
					sc1 = new Scanner(temp);
					sc1.useDelimiter(",");*/
						
					list3.add(Integer.parseInt(sc.next()));
					i++;
					
					
					
				}
				
				if(flag == 0)
				{
					list1= list3;
					flag = 1;
				}
				else
					list2 = list3;
				
				
			}
			/*System.out.println(list1);
			System.out.println(list2);*/
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
	}
	public static List<Integer> getList1() {
		return list1;
	}
	public static List<Integer> getList2() {
		return list2;
	}

}
