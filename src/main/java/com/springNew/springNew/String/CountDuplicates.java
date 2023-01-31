package com.springNew.springNew.String;

import java.util.HashMap;

/**
 * @author krishnakumar
 *
 */
public class CountDuplicates {

	public static void main(String[] args) {
		//words
		{
		countDuplicatesWords("java spring spring boot java");
		countDuplicatesWords("Super Man Bat Man Spider Man");
		countDuplicatesWordsM2("Big black bug bit a big black dog on his big black nose a");
		}
		//char
		 {
		countDuplicatesChars("College");
		countDuplicatesCharsHashMap("JavaDeveloper");
		}
	}

	private static void countDuplicatesCharsHashMap(String string) {
		HashMap<Character, Integer> map=new HashMap<>();
	  //   char[] charArray = string.toCharArray();
	     for(int i=0;i<string.length();i++) {
	    	 if(map.containsKey(string.charAt(i))) {
	    		 map.put(string.charAt(i), map.get(string.charAt(i))+1);
	    	 }
	    	 else {
	    		 map.put(string.charAt(i), 1);
	    	 }
	     }
	     map.forEach((Key,Value) ->{
	    	 if(Value>1) {
	    		 System.out.println(Key+" : "+Value);
	    	 }
	     });
	}

	private static void countDuplicatesChars(String string) {
		char[] charArray = string.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(string.charAt(i) == string.charAt(j)) {
					System.out.println(string.charAt(i));
				}
			}
		}
	}

	private static void countDuplicatesWordsM2(String str) {
		System.err.println("No of Repeated Words in String M2: ");
		String[] words = str.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
		if(count >1 && words[i] !="0") {
			System.out.println(words[i]);
		}
		}
	}

	private static void countDuplicatesWords(String string) {
		System.err.println("No of Repeated Words in String HashMap: ");
		HashMap<String, Integer> map=new HashMap<>();
		String[] split = string.split(" ");
		for (String str : split) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		map.forEach((key,value) -> {
			if(value >1) {
				System.out.println(key + "  : "+value);
			}
		});
	}

}
