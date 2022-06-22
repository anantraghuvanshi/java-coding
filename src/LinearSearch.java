import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to search");
        int number = sc.nextInt();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == number){
                System.out.println("Number is found at index " + i);
                break;
            }
            else System.out.println("Entered number is not found");
        }
    }

}
