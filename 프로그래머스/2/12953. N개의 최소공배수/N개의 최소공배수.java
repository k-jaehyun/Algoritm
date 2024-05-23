import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:arr) {
            int tmp=num;
            for(int i=2;i<=num;i++) {
                int cnt=0;
                while(i*(tmp/i)==tmp) {
                    tmp/=i;
                    cnt++;
                }
                map.put(i, Math.max(map.getOrDefault(i,0),cnt));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            answer*= Math.pow(entry.getKey(), entry.getValue());
        }
        
        return answer;
    }
}