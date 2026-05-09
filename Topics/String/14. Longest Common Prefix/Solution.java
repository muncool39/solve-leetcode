
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        String basic = strs[0];
        for(int i=0;i<basic.length();i++) {
            boolean in = true;
            for(String str : strs) {
                if(str.length() <= i || basic.charAt(i) != str.charAt(i)) {
                    in = false;
                    break;
                }
            }

            if(in) {
                sb.append(basic.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}