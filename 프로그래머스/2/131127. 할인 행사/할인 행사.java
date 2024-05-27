import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        loop2: for(int i=0;i<=discount.length-10;i++) {
            int[] tmpNum = Arrays.copyOf(number, number.length);
            for(int j=0;j<10;j++) {
                    loop1: for(int k=0;k<want.length;k++) {
                        if(discount[i+j].equals(want[k])) {
                            tmpNum[k]--;
                            break loop1;
                        }
                    }
            }
            for(int j=0;j<tmpNum.length;j++) {
                if(tmpNum[j]>0) {
                    continue loop2;
                }
            }
            answer++;
        }
        
        return answer;
    }
}