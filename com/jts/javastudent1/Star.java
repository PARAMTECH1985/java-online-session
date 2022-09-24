package com.jts.javastudent1;

import java.util.*;
public class Star
{
 public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);

System.out.println("Enter No. of rows");

 n=sc.nextInt();

for(i=0;i<=n;i++)
{
System.out.println("\n");

//System.out.println(i);

for(int j=0;j<i;j++)
{
//System.out.println("J is"+j+"\n");

System.out.print(i);
}
}
}
}