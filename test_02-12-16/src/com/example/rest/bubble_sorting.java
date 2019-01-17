package com.example.rest;
import java.util.Scanner;
public class bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, num,temp;
		System.out.println("Enter the Array Size: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		int[] array=new int[num];
		System.out.println("Enter the " +num+ "Elements: ");
		for(i=0;i<num;i++)
		{
			array[i]=input.nextInt();
		}
		for(i=0;i<num-1;i++)
		{
			for(j=0;j<num-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
			System.out.println("Ascending Order Values are: ");
			for(i=0;i<num;i++)
				System.out.println(+array[i]);
		        System.out.println();
		System.out.println("Descending Order values are:");
		for(i=num-1;i>=0;i--)
			System.out.println(+array[i]);
		
		

	}

}
