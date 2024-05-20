import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        String[] strArr = s.toLowerCase().split("");
        int index = 0;
        for(String str : strArr) {
           if(index==0) {
               str=str.toUpperCase();
               index=1;
            }
            answer+=str;
            
            if(str.equals(" ")) {
                index=0;
            }
        }
        
        return answer;
    }
}