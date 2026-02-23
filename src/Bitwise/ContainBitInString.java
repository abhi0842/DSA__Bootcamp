package Bitwise;

import java.util.HashSet;
import java.util.Set;

public class ContainBitInString {
    public static boolean hasAllCodes(String s, int k) {
        int newString = 1 << k;
        if (s.length() < k + newString - 1) {
            return false;
        }
        Set<String> seen = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            seen.add(s.substring(i, i + k));
            if (seen.size() == newString) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n=2;
        String s="00110110";
        System.out.println(hasAllCodes(s,n));
    }
}
