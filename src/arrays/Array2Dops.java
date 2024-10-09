package arrays;

import java.util.Scanner;

public class Array2Dops {
	public static String arr[][];
	public Scanner sc = new Scanner(System.in);
	public void createArray(int cls,int stu) {
		arr=new String[cls][stu];
	}
	public void insertData(int cls,int stu) {
		System.out.println("collecting student Names: ");
		for(int i=0;i<cls;i++) {
		System.out.println("Inside the class number: "+(i+1));
		for(int j=0;j<stu;j++) {
			System.out.println("Enter the name of student: "+(j+1));
			arr[i][j]= sc.next();
		}
		}
		System.out.println("Data is loaded on to the array.");
		System.out.println("--------------------------------");
	}
	public void display(int cls,int stu) {
		System.out.println("Dispalying student Names: ");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class number: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The name of student number_"+(j+1)+" is="+arr[i][j]);
			}
		}
		System.out.println("-------------------------------------");
	}
}

					
		
		
	


