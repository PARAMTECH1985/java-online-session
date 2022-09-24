package com.jts.javastudent2;
import java.util.*;

public class Swap_ing{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println(a);
        // System.out.println(b);

        int c;
        c = a;
        a = b; 
        b = c;
        // a = b;
        // b = c;
        // c = a;

        // c = a; 
        // a = b;
        // b = c;
        
        System.out.println(a);
        System.out.println(b);
    }
}