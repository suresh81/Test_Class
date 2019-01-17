package com.example.test;
import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		int n,m=0,flag=0;
		System.out.println("Enter the no to verify prime or not: ");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		m=n/2;
		for(int i=2;i<=m;i++)
		
			if (n%i==0)
			{
				System.out.println("Entered no is not prime");
				flag=1;
				break;
			}
			else if (flag==0) {
				System.out.println("Entered no is prime");
				
			}
		
		
		

	}

}
