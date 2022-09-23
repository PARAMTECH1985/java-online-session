import java.util.*;

public class Array{

    public static void main(String[] args){
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
       
    //    System.out.println(marks[0]); 
    //    System.out.println(marks[1]); 
    //    System.out.println(marks[2]); 

    for(int i = 0; i < size; i++){
        numbers[i] = sc.nextInt();
    }

    for(int i = 0; i<size; i++){
        System.out.println(numbers[i]);
    }
    }
}

for(i=0;i<3;i++){
    cin>>a;
    A[i]=a
}