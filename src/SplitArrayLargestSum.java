public class SplitArrayLargestSum {
    //https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args) {

    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for(int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num: nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else end =mid;
        }
        return end;
    }
}
