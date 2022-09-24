package com.jts.javastudent1;
import java.util.Scanner;
public class Result1
{
public static void main (String arrgs[])
{
int a,b,c,d,e;
System.out.println("Enter you five subject numbers :-");
Scanner sc=new Scanner(System.in);

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();

int Total=a+b+c+d+e;
System.out.println("Your Total Number is:-"+Total);  
int avg=Total/5;
 
if(avg>=85)
{
System.out.println("Your Grade is A+");
}

else if(avg>=75)
{
System.out.println("Your Grade is A");
}

else if(avg>=65)
{
System.out.println("Your Grade is B");
}

else if(avg>=50)
{
System.out.println("Your Grade is D");
}
else if(avg>=33)
{
System.out.println("Your Grade is E");
}
else
{
System.out.println("You Are Failed");
}
}
}