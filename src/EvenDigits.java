import java.util.*;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {18, 124, 9, 1764, 98, 12};
        System.out.println(findNumbers(nums));

    }
    public static int findNumbers(int[] nums){
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int count =0;
        while(num>0){
            num=num /10;
            count++;
        }
        if(count %2 ==0){
            return true;
        }
        else return false;
    }
}
