package com.jts.javastudent2;
import java.util.*;

public class CalculateNum{

    public static int PrintNumber(int n){

        if(n %2 == 0){
            System.out.println("n is even");
        }
        else{
            System.out.println("n is not even");
        }return n;

        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

       PrintNumber(n);
    }

}