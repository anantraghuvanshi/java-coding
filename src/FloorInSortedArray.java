import java.util.Arrays;
import java.util.Scanner;

public class FloorInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int target = sc.nextInt();

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(floor(arr, target));

    }
    public static int floor(int[] arr, int target){
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end-start) / 2;
            if (target< arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
