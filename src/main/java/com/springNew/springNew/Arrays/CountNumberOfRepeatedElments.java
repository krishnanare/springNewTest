package com.springNew.springNew.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author krishnakumar
 *
 */
public class CountNumberOfRepeatedElments {

	public static void main(String[] args) {
		int arr[]= {30,20,40,10,55,50,66,20,30,66,30,50,50,50};
		int n=arr.length;
		frequencyOfNumbers(arr,n);
		frequencyOfNumbersUsingWhile(arr,n);
		frequencyOfNumbersUsingMap(arr,n);
		printDuplicates(arr,n);
	}

	private static void printDuplicates(int[] arr, int n) {
		 System.out.println("-------------------------------");
		  System.out.println("printing only duplicates elements : ");
		  System.out.println("-------------------------------");
		  Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>=2) {
				System.out.println(arr[i]);
			}
			  
				
		}
		
	}

	private static void frequencyOfNumbersUsingMap(int[] arr, int n) {
		  System.out.println("-------------------------------");
		  System.out.println("Using HashMap : ");
		  System.out.println("-------------------------------");
		Map<Integer, Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		mp.forEach((key,value) ->{
			if(value>=2) {
				System.out.println(key+" : "+value);
			}
		});
	}

	private static void frequencyOfNumbersUsingWhile(int[] arr, int n) {
		  System.out.println("-------------------------------");
		  System.out.println("Using While : ");
		  System.out.println("-------------------------------");
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			int count=1;
			while(i<n-1 && arr[i] == arr[i+1]) {
				count++;
				i++;
			}
			if(count>=2)
		  System.out.println(arr[i]+" : "+count);
		}
		
	}

	private static void frequencyOfNumbers(int[] arr, int n) {
		  System.out.println("-------------------------------");
		  System.out.println("Using  Temp Arr  : ");
		  System.out.println("-------------------------------");
		// in temp arr storing all  the repeated elements 
		int[] temp=new int[n];
		int   flag=-1;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
					// to avoid countinf same value again 
					temp[j]=flag;
				}
			}
			if(temp[i]!=flag)
				temp[i]=count;
			// System.out.println(arr[i]+" : "+count);
		}
		for(int k=0;k<n;k++) {
			if(temp[k] != flag &&  temp[k] >=2) {
				System.out.println(arr[k]+" : "+temp[k]);
			}
		}
	}
}
