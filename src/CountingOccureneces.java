import java.util.*;

public class CountingOccureneces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long n = sc.nextLong();
        int count =0;
        while(n>0){
            if(n%10 ==number)
                count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
