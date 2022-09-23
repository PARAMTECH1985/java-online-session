import java.util.*;

public class summition{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // int i = 1;
        int sum = 0;
        int odd = 0;
        int even = 0;
        
            
            // while(i <= 10000){

            //     if(i % 2 == 0){
            //         even += i;
            //     }
            //     else{
            //         odd += i;
            //     }
            //     i++;
                
            // }
            // System.out.println(even);
            // System.out.println(odd);

            // for( int i = 1; i <= 10000; i++){
            //     if(i % 2 == 0)
            //         even += i;

            //     else
            //         odd += i;

                
            // }
            // System.out.println(even);
            // System.out.println(odd);
            int i = 1;
            do{
                if(i % 2 == 0){
                    even += i;

                }
                else{
                    odd += i;
                }
                i++;
            }while(i <= 10000);
            System.out.println(even);
            System.out.println(odd);

        
    }
}