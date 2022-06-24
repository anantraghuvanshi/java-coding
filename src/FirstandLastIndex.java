public class FirstandLastIndex {

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        if(target > nums[nums.length-1]){
            return new int[]{-1, -1};
        }

        while(start <= end){
            int mid = start + (end-start) / 2;
            if (target< nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else {
                return nums[mid];
            }
        }
        return nums[start];
    }
}
