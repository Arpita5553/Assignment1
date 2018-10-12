
/*
 * Author : Arpita Bhalerao
 * Version : 1.0
 * Description : Implementation of the arithmetic Interface which will provide the
 * services to the consumer
 */

package org.opus.servicesproducer;

import java.util.ArrayList;
import java.util.List;

import org.opus.arithmaticservices.ArithmeticOperations;

public class ArithmeticImplementation implements ArithmeticOperations
{
	
	//int sum = 0;
	int count = 0;
	@Override
	public List<Integer> addition(List<Integer> l1, List<Integer> l2)
	{
		// TODO Auto-generated method stub
		
		//This method will return the sum of elements
		
		List<Integer> addition = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            addition.add(l1.get(i) + l2.get(i));
        }
        return addition;
		
	}
	
	@Override
	public float average(List<Integer> numbers) {
		count = numbers.size();
		int sum = 0;
		for (int i : numbers)
		{
		    sum += i;
		}
		System.out.println(sum);
		return sum/count;
	}
	
	@Override
	public List<Integer> substraction(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		
		List<Integer> sub = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            sub.add(l1.get(i) - l2.get(i));
        }
        return sub;
		
	}

	@Override
	public List<Integer> multiply(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> mul = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            mul.add(l1.get(i) * l2.get(i));
        }
        return mul;
	}
	
	@Override
	public List<Integer> divide(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> div = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            div.add(l1.get(i) / l2.get(i));
        }
        return div;
	}
	
	@Override
	public List<Integer> modulus(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> mod = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            mod.add(l1.get(i) %l2.get(i));
        }
        return mod;
	}
}
