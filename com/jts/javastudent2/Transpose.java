package com.jts.javastudent2;
import java.util.*;

public class Transpose{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int num[][] = new int[N][M];

        for(int i = 0; i <N; i++ ){
            for(int j = 0; j< M; j++){
                num[i][j] = sc.nextInt();
            }

        }
        System.out.println("there are transpose matrix is: ");

        for(int j = 0; j < M; j++){
            for(int i = 0; i < N; i++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}