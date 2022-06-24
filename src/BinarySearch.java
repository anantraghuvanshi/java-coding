import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you wanna find: ");
        int target = sc.nextInt();

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(binarysearch(arr, target));

    }
    public static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end-start) / 2;// can be written as start + end /2 but it can sometimes exceed the int range so there will be overflow.
            if (target< arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
