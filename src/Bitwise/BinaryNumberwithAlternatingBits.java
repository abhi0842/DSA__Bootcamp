package Bitwise;

public class BinaryNumberwithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        int pre=n&1;
        n=n>>1;
        while(n>0){
            int curr=n&1;
            if(curr==pre){
                return false;
            }
            pre=curr;
            n=n>>1;
        }
        return true;
    }
    public static void main(String[] args) {
     int n=7;
        System.out.println(hasAlternatingBits(n));
    }
}
