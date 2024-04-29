import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        List<String> cards1List = new ArrayList<>();
        List<String> cards2List = new ArrayList<>();
        
        for(int i=0;i<cards1.length;i++) {
            cards1List.add(cards1[i]);
        }
        for(int i=0;i<cards2.length;i++) {
            cards2List.add(cards2[i]);
        }        
        
        for(int i=0;i<goal.length;i++) {
            if(cards1List.indexOf(goal[i])==0) {
                cards1List.remove(0);
            } else if(cards2List.indexOf(goal[i])==0) {
                cards2List.remove(0);
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}