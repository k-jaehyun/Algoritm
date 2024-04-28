import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        for(int i=0;i<score.length;i++) {
            int[] tmp = new int[i+1];
            for(int j=0;j<=i;j++) {
                tmp[j] = score[j];
            }
            Arrays.sort(tmp);
            
            if(i<k) {
                answer[i] = tmp[0];
            } else {
                answer[i] = tmp[i-k+1];   
            }
        }
        
        return answer;
    }
}