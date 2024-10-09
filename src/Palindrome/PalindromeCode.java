package Palindrome;

import java.util.Scanner;

public class PalindromeCode {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1 = sc.next();
	String s2 = "";
	//Converting the given string into its reverse
	for(int i=s1.length()-1;i>=0;i--) {
		s2 = s2 + s1.charAt(i);
	}
	//checking if the given string is palindrome or not
	if(s1.equals(s2)==true) {
		System.out.println("The given string is palindrome");
	}
	else {
		System.out.println("The given string is not a palindrome");
	}
}
}

		
	

