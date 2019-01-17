package com.example.rest;
import java.util.Scanner;
public class num_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n,reverse=0;
    System.out.println("Enter the no: ");
    Scanner input=new Scanner(System.in);
    n=input.nextInt();
  //  while(n!=0)
    for(;n!=0;)
    {
    	reverse=(reverse*10)+(n%10);
    	n=n/10;
    }
    System.out.println("Reverse number was: "+reverse);

	}

}
