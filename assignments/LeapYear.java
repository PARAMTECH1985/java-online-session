//17/9/2022
//WAP to Leap Year

import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
int n;
System.out.println("Please Enter Any year");

Scanner sc=new Scanner(System.in);
n=sc.nextInt();

if(n%4==0)
{
System.out.println("This is a LeapYear");
}
else
{
System.out.println("This is a Not LeapYear");
}
}
}