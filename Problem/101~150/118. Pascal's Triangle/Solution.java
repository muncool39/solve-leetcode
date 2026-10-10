import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        for(int i=1;i<numRows;i++) {
            List<Integer> plist = new ArrayList<>();
            plist.add(1);
            List<Integer> blist = list.get(i-1);
            for(int j=1;j<i;j++) {
                int num = blist.get(j-1) + blist.get(j);
                plist.add(num);
            }
            plist.add(1);
            list.add(plist);
        }
        return list;
    }
}