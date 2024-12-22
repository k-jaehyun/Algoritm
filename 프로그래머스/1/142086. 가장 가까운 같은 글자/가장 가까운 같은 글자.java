import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        int index=0;
        for(int i=0;i<s.length();i++) {
            int tmp = map.getOrDefault(s.charAt(i),-1);
            if(tmp==-1) {
                answer[i] = -1;
            } else {
                answer[i] = i-tmp;
            }
            map.put(s.charAt(i), i);
        }
        
        return answer;
    }
}