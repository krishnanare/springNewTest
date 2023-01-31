package com.springNew.springNew.Arrays;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * @author krishnakumar
 *
 */
public class testS {

	public static void main(String[] args) {
		String a="c";
		String b="A";
		System.out.println(a.charAt(0)+" < "+b.charAt(0)+" = "+ (a.charAt(0)<b.charAt(0)));
		sortString();
		repeatedElements();
		repeatedElementsUsingHashMap();
	}
	public static void sortString() {
		String str="bcdafe";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int k=i+1;k<charArray.length;k++) {
				if(charArray[k] < charArray[i]) {
					char temp =charArray[i];
					charArray[i]=charArray[k];
					charArray[k]=temp;
				}
			}
		}
		System.out.println(charArray);
	}
	public static void repeatedElements() {
		String str="javaroaring";
		char[] charArray = str.toCharArray();
		ArrayList<Character> list=new ArrayList<>();
		System.out.println("Repeated Elements in string ");
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					if(!list.contains(charArray[i])) {
						list.add(charArray[i]);
						System.out.println(charArray[i]);
					}
				}
			}
		}}
	public static void repeatedElementsUsingHashMap() {
		System.out.println("Frequency of Elements more than 2 in string ");
		String str="JavaIsBestProgrammingLanguage";
		HashMap<Character, Integer> map=new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		map.forEach((key,value) -> {
			if(value>=2) 
				System.out.println(key + " : "+value);
			
		});;
	}

}
