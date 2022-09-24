package com.jts.javastudent2;
import java.util.*;

public class Table_of{

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++){

            System.out.println(i * n);
        }
        
    }
}