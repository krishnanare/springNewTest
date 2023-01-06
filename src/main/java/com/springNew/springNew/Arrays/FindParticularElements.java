package com.springNew.springNew.Arrays;

/**
 * @author krishnakumar
 *
 */
public class FindParticularElements {

	public static void main(String[] args) {
		int[] arr= {10,30,21,34,55,34,45,99,54,88};
		int len = arr.length;
		findElement(arr,len);

	}

	private static void findElement(int[] arr, int len) {
		int value=55;
		for(int i=0;i<len;i++) {
			int count=1;
			if(arr[i] == value) {
				count++;
			}
			if(count>1) 
				System.out.println("Element "+ value+"  Found At  : " + i);
			
		}
	}
}
