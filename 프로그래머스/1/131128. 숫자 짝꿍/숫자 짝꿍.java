import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        for(char c : X.toCharArray()) {
            xCount[c-'0']++;
        }
        for(char c : Y.toCharArray()) {
            yCount[c-'0']++;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            int count = Math.min(xCount[i],yCount[i]);
            for(int j=0;j<count;j++) {
                list.add(i);
            }
        }
        
        if(list.size()==0) {
            return "-1";
        }
        
        Collections.reverse(list);
        if(list.get(0)==0) {
            return "0";
        }
        
        StringBuilder builder = new StringBuilder();
        for(int num : list) {
            builder.append(num);
        }
        
        return builder.toString();
    }
}