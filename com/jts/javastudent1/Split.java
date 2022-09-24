package com.jts.javastudent1;
 //public java.lang.String[] split(java.lang.String);

public class Split
{

public static void main (String str[])
{
String sp;

sp="My name is Nikita Raghuwanshi";

String sp1[]=sp.split("\\s");

for(String s:sp1)
{
System.out.println(s);
}
}
}