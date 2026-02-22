package Bitwise;

public class bitdistance {
    public  static int binaryGap(int n) {
        int pos =0;
        int last=-1;
        int dist=0;
        while(n>0){
            if((n&1)==1){
                if (last != -1) {
                    dist = Math.max(dist, pos - last);
                }
                last = pos;
            }
            pos++;
            n >>= 1;
        }
        return dist;
    }

    public static void main(String[] args) {
        int n=22;
        System.out.println(binaryGap(n));

    }
}
