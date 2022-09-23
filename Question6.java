import java.util.*;

public class Question6{

    public static void printLoop(int  n){

        do{
            System.out.println("hello world!");
            n++;
        }while( int i = 1; ; i++ );
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printLoop(n);
    }
}