class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        int place = 0;
        while(index < nums.length) {
            nums[place] = nums[index];
            if(nums[index] == val) {
                count++;
            } else {
                place++;
            }
            index++;
        }
        return nums.length - count;
    }
}