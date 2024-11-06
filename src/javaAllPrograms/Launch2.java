package javaAllPrograms;

import java.util.Scanner;

public class Launch2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2: ");
			int num2 = sc.nextInt();//critical statement
			int res = num1/num2;//critical statement
			System.out.println(res);
		System.out.println("Division Operation Completed");
		
		System.out.println("Array Operation Started");
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();//critical statement
		int arr[] = new int[n];//critical statement
		
		System.out.println("Enter the position to insert value: ");
		int pos = sc.nextInt();//critical statement
		System.out.println("Enter the value: ");
		int val = sc.nextInt();//critical statement
		
		arr[pos]=val;//critical statemnet
		
		System.out.println("Data added");
		System.out.println("Array Operation Completed");
		}
		catch(Exception e)//generic catch block
		{
			System.out.println("Exception Occured in main is handled");
		}
	}
}

		
		

