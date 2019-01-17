package com.example.rest;
import java.util.Scanner;
public class Fib_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fibcount;
		System.out.println("Enter the no to find fib series:");
		Scanner input=new Scanner(System.in);
		fibcount=input.nextInt();
		int[] fib=new int[fibcount];
		fib[0]=0;
		fib[1]=1;
		for(i=2;i<=fibcount-1;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println("Fib series values are: ");
		for(i=0;i<fibcount;i++)
			System.out.print("  "+fib[i]);
			
		

	}

}
