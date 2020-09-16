package com.hsbc.utilities;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//used to get input from the user
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter the string:");
		//declaring string variable and storing the user input 
		String userInput = scanner.next();
		
		//reversing the string and storing it in the variable
		//don't have a method to reverse the string directly . So using stringbuffer
		String reverseString = new StringBuffer(userInput).reverse().toString();
		// displaying the reversed string
		System.out.println("Reversed string is :"+reverseString);
		
		
		//without using stringbuffer
		char[] userStringToArr = userInput.toCharArray();
		//System.out.println(userStringToArr[0]);
	
		for(int i=userStringToArr.length-1;i>0;i--) {
			System.out.print(userStringToArr[i]);
			
		}
	
		
		scanner.close();
	}

}
