import java.util.Scanner;

public class ifUpperCaseOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // way to take the first char as input

        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Entered Character is Lowercase");
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Entered Character is Uppercase");
        }
    }
}
