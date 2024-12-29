import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer=0;
        
        List<Integer> list = new ArrayList<>();
        for(int i:score) {
            list.add(i);
        }
        
        Collections.sort(list, Comparator.reverseOrder());
        for(int i=1;i*m<=list.size();i++) {
            answer+= m*list.get(i*m-1);
        }
        
        return answer;
    }
}