package com.example.rest;
import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse="";
		System.out.println("Enter the string to verify palindrome or not: ");
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		int i,length;
		length=original.length();
		for(i=length-1;i>=0;i--)
		{	
			reverse=reverse+original.charAt(i);
		}
		
		if(reverse.equals(original))
		
		 System.out.println("Entered String was palindrome  " +reverse);
		
		else
			System.out.println("Entered string was not palindrome  " +reverse);
		
		

	}

}
