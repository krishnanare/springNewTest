package com.springNew.springNew.String;

/**
 * @author krishnakumar
 *
 */
public class CountWordsStrings {

	public static void main(String[] args) {
		countWordsM1("I Love Java");
		
		countWordsM2("I Love SpringBoot Java");
		
		countWordsM3("I Love Java SpringBoot Hibernate MicroServices");
	}
	private static void countWordsM1(String str) {
		String[] split = str.split(" ");
		System.out.println("Total No Of Words In String m1: " +split.length);
	}
	private static void countWordsM2(String string) {
		int count=0;
	   for(String word:string.split(" ")) {
		   count++; 
	   }
	   System.out.println("Total No Of Words In String m2: " +count);
	}
	private static void countWordsM3(String string) {
		int count=0;
		for(int i=0;i<=string.length()-1;i++) {
			if(string.charAt(i) == ' ' && string.charAt(i+1)!=' ') {
				count++;
			}
		}
		String[] split = string.split(" ");
		int s=0;
		for (String string2 : split) {
			System.err.println("-----"+string2);
			s++;
		}
		 System.out.println("Total No Of Words In String m2: "+s );
		 System.out.println("Total No Of Words In String m3: " +count);
	}
	
}
