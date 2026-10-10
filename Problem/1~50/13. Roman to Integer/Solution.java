import java.util.*;

class Solution {
    HashMap<String, Integer> map = new HashMap<>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};

    public int romanToInt(String s) {
        if(s.length() == 1) {
            return map.get(s);
        }

        int sum = 0;
        for(int i=0;i<s.length();i++) {
            if(i==s.length()-1) {
                sum+=map.get(s.substring(i, i+1));
                break;
            }
            String str = s.substring(i, i+2);
            if(map.containsKey(str)) {
                sum+=map.get(str);
                i++;
            } else {
                sum+=map.get(str.split("")[0]);
            }
        }

        return sum;
    }
}
