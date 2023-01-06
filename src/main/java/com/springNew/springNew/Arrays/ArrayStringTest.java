package com.springNew.springNew.Arrays;

/**
 * @author krishnakumar
 *
 */
public class ArrayStringTest {

	public static void main(String[] args) {
		String[] arr= {"K","R","I","S","H","N","A"};
		int len= arr.length;
		printAsString(arr,len);
	}
	

	private static void printAsString(String[] arr, int len) {
		String append="";
		for(int i=0;i<len;i++) {
			append=append+arr[i];
		}
		System.out.println(append.toLowerCase().concat(" Nare"));
	}
}
