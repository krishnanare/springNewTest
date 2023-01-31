package com.springNew.springNew.basic.interview;

/**
 * @author krishnakumar
 *
 */
public class CountSpecialCharecters {

	public static void main(String[] args) {
		String data="CloudTech@123";
		int n = data.length();
		int count=0;
		for(int i=0;i<n;i++) {
		//	checking each charecter while iterating 
			if(!Character.isAlphabetic(data.charAt(i)) && !Character.isDigit(data.charAt(i)) && !Character.isSpace(data.charAt(i)) ) {
				count++;
			}
		}
		System.out.println("Total Special Charecters : " +count);
	}

}
