package com.example.rest;
import java.util.Scanner;
public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		System.out.println("Enter the string:");
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		int i,length;
		length=original.length();
		for(i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		    System.out.println("Reverse string was: "+reverse);

	}

}
