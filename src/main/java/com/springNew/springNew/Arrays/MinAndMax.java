package com.springNew.springNew.Arrays;
/**
 * @author krishnakumar
 *
 */
public class MinAndMax {

	/// works for both sorted and unsorted 
	public static void main(String[] args) {
		int[] arr= {10,20,14,133,12,18,20,21,20,21,91,0};
		int length = arr.length;
		//Arrays.sort(arr);
		int max = max(arr, length);
		System.out.println("Maximum Number in array : "+max);
		int min = min(arr,length);
		System.out.println("Minumum Number in array : "+min);
		max2(arr, length);
	}

	private static int min(int[] arr, int length) {
		int minimum=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		return minimum;
	}

	private static void max2(int[] arr, int length) {
		int max = arr[0];
	   for(int i=0; i<arr.length; i++)
	     {
	       if(max < arr[i])
	       {
	          max = arr[i];
	       }}
		//System.out.println(max);
	}

	private static int max(int[] arr, int length) {
		int maximum=arr[0];
		for(int i=0;i<length;i++) {
			if(arr[i]>=maximum) {
				maximum=arr[i];
			}
		}
		return maximum;
	}

}
