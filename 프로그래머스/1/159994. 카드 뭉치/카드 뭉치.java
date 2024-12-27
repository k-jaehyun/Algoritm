import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));
        
        for(String str:goal) {
            if(cards1List.size()!=0) {
                if(str.equals(cards1List.get(0))) {
                    cards1List.remove(0);
                    continue;
                }
            }
            if(cards2List.size()!=0) {
                if(str.equals(cards2List.get(0))) {
                    cards2List.remove(0);
                    continue;
                }
            }
            return "No";
        }
        
        return "Yes";
    }
}