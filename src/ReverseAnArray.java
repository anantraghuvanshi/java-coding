import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int n){
        int s = 0;
        int e = n-1;
        while(s<e){
            swap(arr, s, e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
