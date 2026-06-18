class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for(int i=0;i<haystack.length()-len+1;i++) {
            boolean same = true;
            for(int j=0;j<len;j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    same = false;
                    break;
                }
            }
            if(same) {
                return i;
            }
        }

        return -1;
    }
}