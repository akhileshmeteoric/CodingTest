/**
 * 
 */
package com.akhilesh.string;

/**
 * @author Akhilesh Kumar Bhagat
 *
 *         18 Dec, 2020
 *         
 */
public class ReverseString {
	public static void main(String[] args) {
		String str = "Bhagat Kumar Akhilesh";
		String arr[] = str.split(" ");
		System.out.println("Reverse String using built-in methods");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse String without using built-in methods");

		char ch[] = str.toCharArray();
		String result = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}
			int j = i + 1;
			while (j <= k) {
				result = result + ch[j];
				j++;
			}
			result = result + " ";

		}
		System.out.print(result);

	}
}
