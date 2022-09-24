package com.jts.javastudent1;
//  public java.lang.String[] split(java.lang.String, int);

public class SplitExample2
{
public static void main(String abc[])
{
String separate;
separate=" 1 2 3";
String num []= separate.split("\\s");

for(String i:num)
System.out.println(i);
}
}