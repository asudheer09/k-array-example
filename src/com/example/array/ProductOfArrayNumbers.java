package com.example.array;

public class ProductOfArrayNumbers {
	
	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5};
		
		int product=1;
		
		for (int i : numbers) {
			product= product*i;
		}
		
		
		System.out.println(" product of all array numbers are :"+product);
		
		
	}

}
