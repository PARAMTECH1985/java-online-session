import java.util.Scanner;

public class calculator_cv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers, whatever you want to give it:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("enter a character");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
                case '-':
                    System.out.println(num1 - num2);

                break;
                case '/':
                System.out.println(num1 / num2);
                
                break;
                case '*':
                System.out.println(num1 * num2);
                
                break;
        
            default:
            System.out.println("invalid operator");
                break;
        }


    }
}
