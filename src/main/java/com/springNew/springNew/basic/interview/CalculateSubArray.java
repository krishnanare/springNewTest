package com.springNew.springNew.basic.interview;

/**
 * @author krishnakumar
 *
 */
public class CalculateSubArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n = arr.length;
		int k=3,result = 0;
		for(int i=1;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					result++;
				}
			}
		}
		System.out.println("No Of Subarrays that equals to " + k + "  :  " + result);
	}

}
