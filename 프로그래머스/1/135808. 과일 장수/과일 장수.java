import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i=0;i<score.length/2;i++) {
            int tmp = score[i];
            score[i] = score[score.length-i-1];
            score[score.length-i-1]=tmp;
        }
        
        for(int i=0; i<(score.length/m)*m ; i+=m) {
            answer+=score[i+m-1]*m;
        }
        
        
        return answer;
    }
}