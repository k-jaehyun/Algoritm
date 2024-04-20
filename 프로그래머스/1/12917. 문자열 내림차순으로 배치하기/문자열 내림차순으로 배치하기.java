import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        for(int i=0;i<s.length();i++) {
            answer+=charArr[s.length()-i-1];
        }
        
        
        return answer;
    }
}