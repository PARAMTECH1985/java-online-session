package com.jts.javastudent1;
//WAP to calculate simple intrest

import java.util.Scanner;
public class SimpleInterest1
{
public static void main(String str[])
{
int p,r,t,si;
Scanner sc=new Scanner(System.in);

System.out.println("Please Enter the Principle");
p=sc.nextInt();

System.out.println("Please Enter the Rate");
r=sc.nextInt();

System.out.println("Please Enter the Time");
t=sc.nextInt();

si=p*r*t;
si=si/100;
System.out.println("This Is Your Number:"+si);
}
}