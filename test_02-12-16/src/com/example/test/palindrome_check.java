package com.example.test;
import java.util.Scanner;
public class palindrome_check {

	public static void main(String[] args) {
		String original, reverse=" ";
		System.out.println("Enter the string verify palidrome or not:");
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		int i, length;
		length=original.length();
		for(i=0;i<=length-1;i++)
		{
			reverse=reverse+original.charAt(i);
		}	
		if(reverse.equals(original))
			System.out.println("Entered string was palindrome: " +reverse);
		else
			System.out.println("Entered string was not palindrome: " +reverse);
		
		input.close();	

	}

}
