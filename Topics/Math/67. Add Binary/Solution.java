import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger ia = new BigInteger(a, 2);
        BigInteger ib = new BigInteger(b, 2);
        return ia.add(ib).toString(2);
    }
}