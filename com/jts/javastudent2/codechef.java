package com.jts.javastudent2;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i <= 100; i++){
		    
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    
		    if(N < K){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		} 
	}
}
