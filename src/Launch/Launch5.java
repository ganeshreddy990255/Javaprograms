package Launch;

import java.util.Scanner;

class Operation1{
	void function1() throws Exception{
		System.out.println("Inside Function-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2: ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
		System.out.println("Left Function-1");
	}
}
		
		class Operation2{
			void function2() throws Exception{
				try {
					System.out.println("Inside Function-2");
					Operation1 op1 = new Operation1();
					op1.function1();
				}
catch (Exception e) {
	System.out.println("Exception handled in function-3");
	throw e;
}
				System.out.println("Left Function-2");
			}
		}
		

public class Launch5 {
public static void main(String[] args) {
	System.out.println("Inside main Function");
	Operation2 op2 = new Operation2();
	try {
		op2.function2();
	}
	catch (Exception e) {
		//TODO Auto-generated catch block
		System.out.println("main Handled the exception");
	}
	System.out.println("Left Function main");
		
	}
	
}

