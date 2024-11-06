package com.destination.july.oct18;

import java.util.Scanner;

public class Launch1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2: ");
			int num2 = sc.nextInt();//critical statement
			int res = num1/num2;//critical statement
			System.out.println(res);
		}
			catch (Exception e) //generic catch block
			{
				System.out.print("Exception Occured in main is handled");
			}
		}
		}
			
			
		
		
	

