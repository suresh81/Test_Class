package com.example.rest;
import java.util.Scanner;
public class string_to_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str;
    char ch;
    System.out.println("Enter the String:");
    Scanner input=new Scanner(System.in);
    str=input.nextLine();
    for(int i=0;i<str.length();i++)
    {
    	ch=str.charAt(i);
    	 System.out.println("Character Values '"+i+ "' position are: "+ch);
    }
   
	}

}
