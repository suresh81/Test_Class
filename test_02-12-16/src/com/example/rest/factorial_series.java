package com.example.rest;
import java.util.Scanner;
public class factorial_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		System.out.println("Enter the number to find factorial");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		if(n<0)
		{
			System.out.println("Should enter greater than zero");
		}
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}	
		System.out.println("Factorial values are: "+fact);

	}

}
