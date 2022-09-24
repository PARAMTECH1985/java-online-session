package com.jts.javastudent1;
//2.Write an program to reverse a number.

import java.util.Scanner;
public class ReverseNumber
{
public static void main(String args[])
{
int n,e;
System.out.println("Enter any Number");

Scanner sc=new Scanner(System.in);

n=sc.nextInt();

while(n>0)
{
 e=n%10;

System.out.print(e);
n=n/10;
}
}
}