package Bitwise;

public class ContatenateTheString {
    public static  int concatenatedBinary(int n) {
        long result =0;
        int mod =1000000007;
        for(int i=1;i<=n;i++){
            String sb=Integer.toBinaryString(i);
            for(int j=0;j<sb.length();j++){
                result=(result*2+(sb.charAt(j)-'0'))%mod;
            }

        }

        return (int) result;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(concatenatedBinary(n));
    }
}
