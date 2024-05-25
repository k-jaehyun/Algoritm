import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=elements.length;i++) {
            for(int j=0;j<elements.length*2;j++) {
                int tmp=0;
                for(int k=0;k<i;k++) {
                    tmp+=elements[(j+k)%elements.length];
                }
                set.add(tmp);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}