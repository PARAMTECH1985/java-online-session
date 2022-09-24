package com.jts.socketprogramming;
import java.net.*;
public class Example1 {
	public static void main(String str[])
	{
		Socket sc=new Socket();
		
		System.out.println(sc.getInetAddress().getHostName());
	}

}
