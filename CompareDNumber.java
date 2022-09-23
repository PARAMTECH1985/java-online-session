import java.util.*;

public class CompareDNumber{

    public static int Num(int a, int b){
        if(a > b){
            System.out.println(a + " is greater");
            return a;            
        }
        else{
            System.out.println(b + " is greater");
            return b;
            
        }
       
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        Num(a, b);

    }
}