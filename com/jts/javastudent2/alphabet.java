package com.jts.javastudent2;
import java.util.*;
public class alphabet {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char alph = sc.next().charAt(0);
        System.out.println("enterd character is: " + alph);
        switch (alph) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("character is vowel");
                break;
        
            default:
            System.out.println("character is not vowel");
                
        } 
    }
}
