import java.util.*;

public class CeilingInSortedArray {
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

        System.out.println(cieling(arr, target));

    }
    public static int cieling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start) / 2;
            if (target< arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
