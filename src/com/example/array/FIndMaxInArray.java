package com.example.array;

public class FIndMaxInArray {

	public static void main(String[] args) {
		
		int[] numbers= {12,5,8,4,13};
		
		int max= numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
		
		
		System.out.println("max= "+max);
		
		/*
		i=0 , max=12 		i<5			numbers[i]>max       max		i++
		==========			====		==============		=============
							0<5			12 >12  false		12			1
							1<5			5>12	false		12			2
							2<5			8>12    false		12			3
							3<5			4>12    false		12			4
							4<5			13>12   true		13			5
							5<5   exit from for loop
		*/
		
		
	}

}
