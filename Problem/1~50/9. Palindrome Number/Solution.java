class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int origin = x;
        int reverse = 0;
        while(origin > 0) {
            int end = origin%10;
            reverse*=10;
            reverse+=end;
            origin/=10;
        }

        return x == reverse; 
    }
}