package Strings;

public class CountBinarySubstrings {
    public static int CountBinarySubstrings(String s){
        int result=0;
        int currcount=1;
        int prevcount=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currcount++;
            }
            else{
                result+=Math.min(prevcount,currcount);
                prevcount=currcount;
                currcount=1;
            }
        }
        return result+Math.min(currcount,prevcount);
    }

    public static void main(String[] args) {
        String s="00110011";
        System.out.println(CountBinarySubstrings(s));
    }
}
