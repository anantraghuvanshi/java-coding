public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        System.out.println(rotationcount(arr));

    }
    public static int rotationcount(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
