import java.util.*;
import java.lang.*;

public class ReverseOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rem =0;
        int ans =0;
        int count =0;

        while(n>0){
            rem = n % 10;
            ans =  ans  * 10  + rem;
            n = n /10;
        }
        System.out.println(ans);
    }
}
