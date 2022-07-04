public class BinarySearchIn2DArray {
    public static void main(String[] args) {

        //not in mood to write the main function.

    }
    static int[] search(int[][] arr, int target){
        int row = 0;
        int column = arr.length -1;

        while(row < arr.length && column >=0){
            if(arr[row][column] == target){
                return new int[]{row,column};
            }
            if(arr[row][column] < target){
                row++;
            }
            else column--;
        }
        return new int[]{-1, -1};
    }
}
