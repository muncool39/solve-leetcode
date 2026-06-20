class Solution {
    public int searchInsert(int[] nums, int target) {
        int end = nums.length - 1;
        int front = 0;
        while(front <= end) {
            int mid = (end + front) / 2;
            int n = nums[mid];
            if(n > target) {
                end = mid - 1;
            } else if (n < target) {
                front = mid + 1;
            } else {
                return mid;
            }
        }
        return front;
    }
}