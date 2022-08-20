package com.example.array;


public class SumOfNumbers {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum=sum+i;
		}
		
		System.out.println("sum of total numbers is "+sum);
		
		/*
		i=0, sum=0			i<10		o/p				i++
							0<10	 sum= 0+0=0			1
							1<10     sum= 0+1=1			2
							2<10     sum= 1+2=3			3 */
		
	}

}
