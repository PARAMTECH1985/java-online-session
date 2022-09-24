package com.jts.javastudent2;
import java.util.*;

public class TArrays {

 public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int[][] num = new int[rows][cols];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){
                num[i][j] = sc.nextInt();
            }

        }


        int x = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(num[i][j] == x){
                    System.out.println("our number is found" +"("+  i +"," + j + ")");
                }
                // else{
                //     System.out.println("our number is not found");
                // }
            }
        }
  
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++ ){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}