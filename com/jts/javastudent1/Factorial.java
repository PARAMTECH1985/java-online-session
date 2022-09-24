package com.jts.javastudent1;
//WAP to Find Factorial number

import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
int n=10;
int fact=1;

while(n>0)
{
fact=fact*n;
n=n-1;
}
System.out.println("Factorial number is"+fact);

}
}