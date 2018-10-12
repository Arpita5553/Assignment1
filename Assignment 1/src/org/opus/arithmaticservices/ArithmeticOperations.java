/*
 * Author : Arpita Bhalerao
 * Version : 1.0
 * Description : Interface of the Arithmetic Operations. It will act as Producer in
 * the assignment
 */

package org.opus.arithmaticservices;

import java.util.List;
import java.util.Set;

public interface ArithmeticOperations
{

	public List<Integer> addition(List<Integer> l1, List<Integer> l2);
	public List<Integer> substraction(List<Integer> l1, List<Integer> l2);
	public float average(List<Integer> numbers);
	public List<Integer> multiply(List<Integer> l1, List<Integer> l2);
	public List<Integer> divide(List<Integer> l1, List<Integer> l2);
	public List<Integer> modulus(List<Integer> l1, List<Integer> l2);
}

