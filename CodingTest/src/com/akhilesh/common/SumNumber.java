/**
 * 
 */
package com.akhilesh.common;

/**
 * @author Akhilesh Kumar Bhagat
 *
 *         18 Dec, 2020
 */
public class SumNumber {
	public static void main(String[] args) {

		int num = 123;
		int count = 0;
		System.out.println("Entered Number is : "+ num);
		while (num != 0) {

			count += num % 10;
			num = num / 10;
		}

		System.out.println("Sum of the number is " + count);

	}
}
