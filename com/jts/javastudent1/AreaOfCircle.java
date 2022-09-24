package com.jts.javastudent1;
//WAP to calculate to Area of Square

import java.util.Scanner;
public class AreaOfCircle
{
public static void main(String args[])
{
Double PI=3.14;
Double area;
 int r;
System.out.println("Enter radius of circle");
Scanner sc = new Scanner(System.in);
r=sc.nextInt();
area=PI*r*r;
System.out.println("Area of Circle"+area);
}
}