package com.hcl;
import java.util.Scanner;
	public class LargePrime
	{
	    public static void main(String args[])
	    {
	        long num;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter number");
	        num= sc.nextLong();

	        for(int i=2;i<num; i++)
	        {
	            while(num%i == 0)
	            {
	                //System.out.println(i);
	                num=num/i;
	            }
	        }
	        if(num>2)
	            System.out.println(num);

	    }

	}    

