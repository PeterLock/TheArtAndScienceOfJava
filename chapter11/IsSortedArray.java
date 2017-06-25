package com.chapter11;

public class IsSortedArray {
		
	public static void main(String[] args){
		
		
		char[] array1 =   {'a', 'c', 'e', 'b', 'd'};
		char[] array2 =   {'a', 'b', 'c', 'd', 'e'};
		
		System.out.println("This program calls a method that tests whether an array is sorted or unsorted.");
		
		System.out.print("Array 1 contains: ");
		getUnsortedArray(array1);
		System.out.println();
		
		System.out.print("Array 2 contains: ");
		getSortedArray(array2);
		System.out.println();
		
		if(runIsSortedTest(array1)){
			System.out.println("Array 1 is sorted.");
		} else{
			System.out.println("Array 1 is unsorted.");
		}
		
		if(runIsSortedTest(array2)){
			System.out.println("Array 2 is sorted.");
		} else{
			System.out.println("Array 2 is unsorted.");
		}
		
	}


	private static boolean runIsSortedTest(char[] array) {
		
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1]){
				return false;
			} 
		}
		return false;
	}


	private static void getUnsortedArray(char[] unsortedArray) {
		for(int i = 0; i < unsortedArray.length; i++){
			System.out.print(unsortedArray[i] + " ");
		}	
	}
	private static void getSortedArray(char[] sortedArray) {
		for(int i = 0; i < sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}	
	}	
	

}
