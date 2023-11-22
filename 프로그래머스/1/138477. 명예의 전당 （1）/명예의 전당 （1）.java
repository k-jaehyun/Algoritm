import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> array = new ArrayList<>();

        for (int i=0;i< score.length;i++) {
            array.add(score[i]);
            Collections.sort(array);
            if(array.size()>k) {
                array.remove(0);
            }
            answer[i]=array.get(0);
        }
        
        return answer;
    }
}