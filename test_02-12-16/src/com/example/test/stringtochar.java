package com.example.test;

import java.util.Scanner;
public class stringtochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		char ch;
		int i;
		System.out.println("Enter the string:");
		Scanner input=new Scanner(System.in);
		a=input.nextLine();
		for(i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			System.out.println("Character postion '"  +i+ "' value:"+ch);
		} 

	}

}
