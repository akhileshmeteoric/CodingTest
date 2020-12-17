/**
 * 
 */
package com.akhilesh.string;

/**
 * @author Akhilesh Kumar Bhagat
 *
 * 18 Dec, 2020
 */
public class CharacterCount {
public static void main(String[] args) {
	String countMe="India";
	char ch[]=countMe.toCharArray();
	//Without using in built method
	int temp=0;
	for (int i = 0; i < ch.length; i++) {
		temp=i;
	}
	
	System.out.println("Sum of the String is : "+(temp+1));
	
}
}
