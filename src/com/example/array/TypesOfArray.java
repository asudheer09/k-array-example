package com.example.array;

public class TypesOfArray {

	public static void main(String[] args) {
		
		int[] a= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30; //a[a.length-1]=30
		
		System.out.println("============>iterating through foreach<===============");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("============>iterating through for loop<===============");
		
		for (int i = 0; i < a.length; i++) { 
			System.out.println(a[i]);
		}
		
		/*
		i=0			i<3		o/p			i++ =i+1
					0<3   a[0] 10		1
					1<3   a[1] 20		2
					2<3   a[2] 30		3
					3<3 false
		*/
		
		float[] f= new float[10];
		
		double[] d= {12.5,13.6,14.5};
		
		char[] chars= {'c','d','e','f'};
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		String[] names= {"sudheer","suren","kb"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		String[] staff= {"CEO","workers","security"};
		
		Employee e1 = new Employee(123, "abi",staff);
		Employee e2 = new Employee(134, "abc",staff);

		Employee e3 = new Employee(133, "def",staff);
		Employee e4 = new Employee(143, "ghi",staff);
		Employee e5 = new Employee(153, "jkl",staff);
		
		e1.printStaffOnly(e1);

		
		Employee[] empArray= new Employee[5]; 
		
		empArray[0]=e1;
		empArray[1]=e2;
		empArray[2]=e3;
		empArray[3]=e4;
		empArray[4]=e5;
		
		for (int i = 0; i < empArray.length; i++) {
			Employee e=empArray[i];
			e.printDetails();
			
			//System.out.println(empArray[i].printDetails());
		}	
		
		
		System.out.println("======================= calling ================");
		
		Employee myemp= new Employee(163, "jkl",staff);
		myemp.printEmployeeArray(empArray);
		
		
	}

}
