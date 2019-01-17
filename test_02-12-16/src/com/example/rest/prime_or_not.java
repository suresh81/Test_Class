package com.example.rest;
import java.util.Scanner;
public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,m=0,flag=0;
		System.out.println("Enter the number to verify prime or not:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
			System.out.println("Entered no is not prime");
			flag=1;
			break;
			}
			else if (flag==0) {
				System.out.println("Entered no is prime no");
			}
				
			
		}

	}

}
