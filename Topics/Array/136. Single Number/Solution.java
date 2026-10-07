import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        for(int a : set) {
            return a;
        }
        return 0;
    }
}