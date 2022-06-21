import java.util.*;

public class All3digitArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        for( int i= 100; i<1000; i++){
            if (isArmstrong(i)) System.out.print(i + " ");
        }
    }

    static boolean isArmstrong(int n){
        int org =n;
        int rem=0, sum=0;
        double cube =0;
        while(n>0){
            rem = n %10;
            cube = Math.pow(rem, 3);
            sum += cube;
            n = n/10;
        }
        if (sum ==org) return true;
        return false;
    }
}
