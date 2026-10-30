import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int max = 0;
        int now = nums[0];
        int cnt = 1;
        for(int i=1;i<nums.length;i++) {
            if(now == nums[i]) {
                cnt++;
            } else {
                if(max < cnt) {
                    max = cnt;
                    ans = now;
                }
                now = nums[i];
                cnt = 1;
            }
        }
        if(max < cnt) {
            ans = nums[nums.length-1];
        }
        return ans;
    }
}