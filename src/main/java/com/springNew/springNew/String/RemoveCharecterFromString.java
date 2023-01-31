package com.springNew.springNew.String;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author krishnakumar
 *
 */
public class RemoveCharecterFromString {

	public static void main(String[] args) {
		String str1 = removeCharacterV1("HCLTeEch",'E');
		System.out.println("After Removing Charecter : " +str1);
		try {
			String str2 = removeCharacterV2("krishnaK",'K');
			System.out.println("After Removing Charecter : "+str2);
		} catch (Exception e) {
			e.printStackTrace();}
             String str3 = removeCharacterV3("Graphics", 's');
             System.out.println("After Removing Charecter : "+str3);
	}

	//using StringBuffer 
	private static String removeCharacterV1(String string, char c) {
		StringBuffer sb=new StringBuffer();
		char[] arr = string.toCharArray();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) != c) {
				sb.append(string.charAt(i));
			}
		}
		return sb.toString();
	}
	//using removing char with ""
	private static String removeCharacterV2(String string, char c) throws Exception {
		if(string.equals(null) || string == null) {
			throw new Exception("Given String is Invalid");
		}
		String rmv = string.replaceAll(Pattern.quote(String.valueOf(c)), "");
		return rmv;
	}
	//using filter 
	public static String removeCharacterV3(String str, char ch) {
		if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            throw new IllegalArgumentException("Input String can't be null");
        }
        return str.chars().filter(c -> c != ch).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
	}
}
