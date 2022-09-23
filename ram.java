import java.util.*;
public class ram {
    public static void main(String[]  args){
        int a = 10;
        int b = 25;
        a = 25;
        int sum = a + b;
        System.out.println(sum);
        int diff = b-a;
        System.out.println(diff);
        int mul = a * b;
        System.out.println(mul); 

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }


}