package com.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
		/*
		 * So the approach we are going to take here is 
		 * based on a datastructure called map
		 * We have a collector called HashMap 
		 * here we will be iterating through the array and try to find
		 * the compliment of that number for the given target
		 * for example nums=[1,2,3,4,5] target:5
		 * when we iterate num=1 and the target is 5 so the counterpart
		 * is target-num(5-1)=4 we will try to find if the counterpart
		 * is in the map if yes we will retun the num and the existing
		 * counterpart if not we will just add the num(key) and the 
		 * complement(value)
		 * to the map
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,11,1,5};
		int target=6;
		int result[]=(getTheTwoSum(arr,target));
		for(int i: result) {
			System.out.println(i);
		}

	}
	
	public static int[] getTheTwoSum(int[] arr, int target) {
		int[] result= new int[2];
		Map<Integer,Integer> myMap= 
				new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int complement=target-arr[i];
			if(myMap.containsKey(complement)) {
				result[0]=complement;
				result[1]=myMap.get(complement);
			}
			myMap.put(arr[i], complement);
		}
		
		return result;
	}

}
