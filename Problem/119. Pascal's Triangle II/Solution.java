class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        list.add(List.of(1, 1));
        if(rowIndex < 2) {
            return list.get(rowIndex);
        }
        for(int i=2;i<=rowIndex;i++) {
            List<Integer> before = list.get(i-1);
            List<Integer> now = new ArrayList<>();
            now.add(1);
            for(int j=1;j<i;j++) {
                now.add(before.get(j-1) + before.get(j));
            }
            now.add(1);
            list.add(now);
        }
        return list.get(rowIndex);
    }
}