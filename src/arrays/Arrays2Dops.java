package arrays;

import java.util.Scanner;

public class Arrays2Dops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2Dops ao = new Array2Dops();
		System.out.println("Enter the class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the student count in each class: ");
		int stu = sc.nextInt();
		ao.createArray(cls,stu);
		ao.insertData(cls,stu);
		ao.display(cls,stu);
	}

}
