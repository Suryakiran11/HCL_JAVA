package com.hcl;
import java.util.Scanner;
public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long  a = 1;
		long  b = 2;
		long temp = 0;
		
		long sum = 0;
		
		System.out.println("Enter the value of n");
		long n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			 temp = a + b;
			 a = b;
			 b = temp;
			 
			 if(b%2 == 0)
			 {
				 sum = sum + b;
				 System.out.println(sum);
			 }
		}
	}

}
