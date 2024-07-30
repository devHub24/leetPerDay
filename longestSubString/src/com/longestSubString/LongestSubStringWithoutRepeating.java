package com.longestSubString;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {
	
	public static void main(String [] args) {
		
		System.out.println(longestSubString("pwwkew"));
		
	}
	/*
	 * the major method where calculation begins
	 * here what we do is use a two pointer method
	 * we have two pointer turtle and hare each point to different indexes at a time
	 * so we use these two pointers to get the substring of the given input
	 * before doing the above step we check if we have the same string in 
	 * the current substring
	 */
	public static int longestSubString(String str) {
		Set<Character> strMap= new HashSet<>();
		int turtle=0;
		int hare=0;
		int max=0;
		char[] charArray= str.toCharArray();
		while(true) {
			if(hare>=charArray.length) {
				break;
			}
			if(strMap.contains(charArray[hare])) {
				//System.out.println(charArray[hare]);
				turtle=turtle+1;
				hare=turtle;
				//System.out.println(strMap);
				strMap.clear();
			}else {
				strMap.add(charArray[hare]);
				System.out.println(str.substring(turtle, hare+1));
				 int currMax=str.substring(turtle, hare).length();
				 if(max<currMax) {
					 max=currMax;
				 }
			}
			hare=hare+1;
		}
		
		
		
		return max;
	}

}
