package com.jts.javastudent2;
import java.util.*;

public class Floydd_pyramid{

    public static void main(String[] args){

        //solid rectangle
        int n = 5; 
        int number = 1;
       
        for(int i = 1; i <= n; i++){
           for(int j = 1; j <= i; j++){
            System.out.print(number+ " ");
            number++;
           }
           System.out.println();
        
        }
        
    }
}