package com.example.rest;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str;
   System.out.println("Enter the string to remove the duplicate chars:");
   Scanner input=new Scanner(System.in);
   str=input.nextLine();
   System.out.println(removeduplicatechars(str));
	}
	
	public static String removeduplicatechars(String str)
	{
     
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
    } 
	
}