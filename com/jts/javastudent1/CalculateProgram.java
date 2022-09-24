package com.jts.javastudent1;
//WAP to Calculate

import java.util.Scanner;
public class CalculateProgram
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter two number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Select 1 for the Addition");

System.out.println("Select 2 for the Subtraction ");

System.out.println("Select 3 for the multiplication ");

System.out.println("Select 4 for the divide");

System.out.println("Select 5 for the Remainder");

System.out.println("Select Whatyou want to do.");
c=sc.nextInt();

if(c==1)
{
c=a+b;
System.out.println("Yours Value Addition is"+c);
}

if(c==2)
{
c=a-b;
System.out.println("Yours Value Subtraction is"+c);
}
if(c==3)
{
c=a*b;
System.out.println("Yours Value multiplication is"+c);
}
if(c==4)
{
c=a/b;
System.out.println("Yours Value division is"+c);
}
if(c==5)
{
c=a%b;
System.out.println("Yours Value Remainder is"+c);
}

}
}