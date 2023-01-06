package com.springNew.springNew.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author krishnakumar
 *
 */
public class StringTest {

	public static void main(String[] args) {

		String rev="";
		String val="HClTech";
		String d="JavaProgramming";
		reverseOfString(rev, val);
		{
			//
		 duplicatesInString(d);
		 duplicatesInStringUsingHashMap(d);
		 duplicatesUsingWhile(d);
		}
		 {
			 //
		System.out.println("-------------------------------");
		 System.err.println("Sorting Techniques : ");
		 System.out.println("-------------------------------");
		 sortingString();
		 sortUsingMethod();
		 sortUsingCustom();
		}
	}

	private static void reverseOfString(String rev, String val) {
		int count=0;
		for(int i=val.length()-1;i>=0;i--) {
			rev=rev+val.charAt(i);
			count++;
		}
		System.out.println("-->Reverse of String : " + rev+" \n--> Total charecters : "+count);
	}

	private static void sortUsingCustom() {
		System.err.println("Sorting using for:  ");
		String str="NATURE";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[j]<charArray[i]) {
					char temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(charArray);
	}

	private static void sortUsingMethod() {
		String str="bhagavan";
		char[] chr=str.toCharArray();
		Arrays.sort(chr);
		System.out.println(chr);
	}

	private static void sortingString() {
		 System.err.println("Sorting using while:  ");
		String name="krishnakumar";
		char arr[]=name.toCharArray();
		char temp;
		int i=0;
		while(i<arr.length) {
			int j=i+1;
			while(j<arr.length) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j=j+1;
			}
			i=i+1;
		}
		System.out.println(arr);
	}

	private static void duplicatesInStringUsingHashMap(String d) {
		 System.out.println("-------------------------------");
		  System.out.println("Using HashMap : ");
		  System.out.println("-------------------------------");
		  HashMap<Character, Integer> map=new HashMap<>();
		  char[] chr = d.toCharArray();
		 for(char c:chr) {
			  if(map.containsKey(c)) {
				  map.put(c, map.get(c)+1);
			  }
			  else {
				  map.put(c, 1);
			  }
		  }
		  map.forEach((key,value)->{
			  if(value>=2)
			  System.out.println(key+" : "+value);
		  });
		  
	}

	private static void duplicatesInString(String d) {
		System.out.println("-------------------------------");
		  System.out.println("printing only duplicates elements : ");
		  System.out.println("-------------------------------");
	//	System.err.println(d.length()-1);
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<d.length();i++) {
			for(int j=i+1;j<d.length();j++) {
				if(d.charAt(i)==d.charAt(j)) {
					char charAt = d.charAt(i);
					if(!list.contains(charAt)) {
					list.add(charAt);}
				}
			}
		}
		System.out.println(list);
	}
	
	private static void duplicatesUsingWhile(String d) {
		System.out.println("-------------------------------");
		  System.out.println("Using While : ");
		  System.out.println("-------------------------------");
		  char[] charArray = d.toCharArray();
		  for(int i=0;i<charArray.length;i++) {
			Map<Character, Integer> map=new HashMap<>();
			  int j=i+1,count=0;
			  while(j<charArray.length) {
				  if(charArray[i]==charArray[j]) {
				    count++;
				  }
				  if(count>=2) {
				  map.put(d.charAt(i), count);
				  }
				  j++;
			  }
			 
		  }
	}
}
   

