package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class specialBinaryString {
    public static String makeLargestSpecial(String s) {
        if(s.length()==0) return "";
        List<String> list=new ArrayList<>();
        int start=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)=='1'?1:-1;
            if(sum==0){
                String inner =s.substring(start+1,i);
                list.add("1" + makeLargestSpecial(inner) + "0");
                start=i+1;


            }
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for(String str:list){
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="11011000";
        System.out.println(makeLargestSpecial(s));

    }
}
