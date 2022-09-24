package com.jts.javastudent2;
public class sumition {
    
    public static void main(String[] args) {
        
        // int i = 5;
        // int n = 10;
        // int sum = 0;
        // while(i <= n){
        //     sum += Math.pow(i, n);
        //     i = i+0;
        // }
        // System.out.println(sum);

        int k = 1;
        int sum = 0;

        // while(i <= 10){
        //     k = k*5;
        //     sum = sum + k;
        // }

        for(int i = 5; i <= 10; i++){
            k = k*5;
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
