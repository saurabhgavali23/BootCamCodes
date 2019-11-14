package Test;

import java.security.SecureRandom;
import java.util.Random;

public class Demo {
	
	
	public static void computerMove(int arr[][],char arr1[][])
	{
		int n=random();
		int a=n/3;
		int b=n%3;
		System.out.println("====="+n+" "+a+" "+b);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==a && j==b)
				{
					
					if(arr[i][j]==1 || arr[i][j]==2) 
					{ 
						  computerMove(arr, arr1); 
					} 
					 else 
					 {
						 arr[i][j]=1; 
						 break ; 
					  }
				}
			}
		}
		
	}
	public static int random()
	{
		Random random=new SecureRandom();
		int n=random.nextInt(9);
		if(n!=0)
			return n-1;
		else
			random();
		return 1;
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		char arr1[][]=new char[3][3];
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=0;
			}
		}
		
		
		  arr[0][0]=1; 
		  arr[1][1]=2; 
		  arr[1][0]=1; 
		  arr[2][1]=2;
		 
		
		
		  display(arr); 
		  computerMove(arr,arr1); 
		  System.out.println("====");
		  display(arr);
		 
		
		/*
		 * Random random=new SecureRandom(); for(int i=1;i<9;i++) { int
		 * n=random.nextInt(9); if(n!=0) System.out.println(n); else continue; }
		 */
		 
	}
}
