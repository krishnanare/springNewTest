package com.springNew.springNew.String;

/**
 * @author krishnakumar
 *
 */
public class CountVowelsConsonents {

	public static void main(String[] args) {
		countVowelsConsonents("Eclipse");

	}

	private final static void countVowelsConsonents(String str) {
		int Vowels = 0,Consonents=0;
		for(int i=0;i<str.length();i++) {
			char charAt = str.toLowerCase().charAt(i);
			if(charAt =='a' || charAt == 'e' || charAt== 'i' || charAt == 'o' || charAt== 'u') {
				Vowels++;
			}
			else {
				Consonents++;
			}
		}
		System.out.println("Vowels : " + Vowels + ", Consonents : "+Consonents);
	}

}
