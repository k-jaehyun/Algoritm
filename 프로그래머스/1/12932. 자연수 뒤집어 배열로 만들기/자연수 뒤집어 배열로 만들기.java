import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        // n의 자리수 구하기
        int index=0;
        for(int i=1;;i++){
            if(n/(Math.pow(10,i-1)) < 1) {
                index=i-1;
                break;
            }
        }
        
        int[] answer = new int[index];
        
        String[] array = String.valueOf(n).split("");
        for(int i=0;i<index;i++) {
            answer[i] = Integer.parseInt(array[index-i-1]);
        }
        
        
        return answer;
    }
}