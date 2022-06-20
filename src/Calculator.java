import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user till the user does not press X or x

        while(true){

            char operation = sc.next().trim().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
                System.out.println("Enter number 1");
                int num1 = sc.nextInt();
                System.out.println("Enter number 2");
                int num2 = sc.nextInt();

                if (operation == '+'){
                    System.out.println(num1 + num2);
                }
                if (operation == '-'){
                    System.out.println(num1 - num2);
                }
                if (operation == '*'){
                    System.out.println(num1 * num2);
                }
                if (operation == '/'){
                    if (num2 !=0)
                    System.out.println(num1 / num2);
                    else System.out.println("Can't Divide by Zero");
                }
                if (operation == '%'){
                    System.out.println(num1 % num2);
                }
            } else if (operation== 'x' || operation== 'X') {
                System.out.println("Closing Calculator");
                break;

            } else {
                System.out.println("Enter correct operation");
            }
        }
    }
}
