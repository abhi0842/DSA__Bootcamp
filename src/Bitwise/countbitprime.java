package Bitwise;

class countbitprime{
    public static void main(String[] args) {
        int n=10;
        int m=6;
        System.out.println(countPrimeSetBits(m,n));
    }
   public static int countPrimeSetBits(int left, int right) {
        int count =0;
         for(int i=left;i<=right;i++){
            int setbits=Integer.bitCount(i);
            if(isboolean(setbits)){
                count++;
            }
         }
         return count;
    }
    public static  boolean isboolean(int number){
        if(number<2){
             return false;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
            
        }
        return true;
    }
}