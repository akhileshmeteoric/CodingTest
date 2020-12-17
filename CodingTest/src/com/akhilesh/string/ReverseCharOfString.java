/**
 * 
 */
package com.akhilesh.string;

/**
 * @author Akhilesh Kumar Bhagat
 *
 * 18 Dec, 2020
 */
public class ReverseCharOfString {
public static void main(String[] args) {
	String str="Akhilesh Kumar Bhagat";
	System.out.println("String before reverse   "+ str);
	char ch[]=str.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		
		System.out.print(ch[i]);
	}
}
}
