package com.jts.javastudent2;
public class SumSeries {
    public static void main(String[] args) {
        
        int i = 125;
        int sum = 0;
        while(i >= 5){
            sum += i;
            i = i - 5;
        }
        System.out.println(sum);
    }
}
