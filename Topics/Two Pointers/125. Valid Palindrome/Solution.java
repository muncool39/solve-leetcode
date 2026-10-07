class Solution {
    public boolean isPalindrome(String s) {
        String mdf = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = mdf.length() - 1;
        while (left < right) {
            if (mdf.charAt(left) != mdf.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}