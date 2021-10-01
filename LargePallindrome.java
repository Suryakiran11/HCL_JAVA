package com.hcl;

public class LargePallindrome {

	static boolean pal(int N)
	   {
	       int temp = 0, x = N;
	       while(N > 0)
	       {
	           temp = temp * 10 + N%10;
	           N = (N / 10);
	       }
	       if(temp == x)
	           return true;
	       return false;
	   }
	
	
	   static int largepal()
	   {
	       int largest = 0;
	       for(int i = 100; i <= 999; i++)
	       {
	           for(int j=100; j<=999; j++)
	           {
	               int N = i * j;
	               if(pal(N) && N > largest)
	                   largest = N;
	           }
	       }
	       return largest;
	   }
public static void main (String[] args) 
	{
	   	int answer = largepal();
	   	System.out.println(answer);
	}
}


