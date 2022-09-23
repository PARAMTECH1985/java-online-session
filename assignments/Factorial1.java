//WAP to Find factorial 

import java.util.Scanner;
public class Factorial1
{
public static void main(String args[])
{
int n;
int fact=1;
System.out.println("Enter the Factorial number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(n>0)
{
fact=fact*n;
n=n-1;
}
System.out.println("Factorial"+fact);
}
}