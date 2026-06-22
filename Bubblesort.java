package com.matrics;

public class Bubblesort {
	public static void main (String[] args){
		
		 int [] arr= {8,4,6,7,8};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=1;j<arr.length-i;j++) {
				 if(arr[j-1]>arr[j]) {
					 
					 int temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1]=temp;
				 }
				 
			 } }
		 for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	    }
	}
/*	 Day 2
Operators
Arithmetic
Relational
Logical
Type casting


 * */

}
