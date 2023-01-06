package com.springNew.springNew.Arrays;

/**
 * @author krishnakumar
 *
 */
public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] arr= {10,20,10,30,44,40,91,23,33,1};
		int n=arr.length;
		sumOfElements(arr,n);
	}

	private static int sumOfElements(int[] arr, int n) {
		int curser,sum=0;
		for(curser=0;curser<n;curser++) {
			if(arr[curser] !=0) {
				sum=sum+arr[curser];
			}
		}
		System.out.println("Sum of elements : "+sum);
		System.out.println("Average of elements : "+(sum/2));
		return sum;
	}

}
