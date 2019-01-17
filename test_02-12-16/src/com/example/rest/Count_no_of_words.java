package com.example.rest;
import java.util.Scanner;
public class Count_no_of_words {

	static int i,c=0,res;
	static String n;
	static int wordcount(String s)
	{
		char ch[]=new char[s.length()];
		for(i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
				 c++;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Enter the string to count the no of words: ");
		Scanner input=new Scanner(System.in);
		n=input.nextLine();
				res=Count_no_of_words.wordcount(n);
		System.out.println("no of words = "+res);
		// TODO Auto-generated method stub
		/*int word=1;
		String s;
		System.out.println("Enter the string:");
		Scanner input=new Scanner(System.in);
		s=input.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==' ')
				word++;
		}
		System.out.println("no of words = " +word);
		System.out.println("No of Spaces = " +(word-1));*/
		

	}

}
