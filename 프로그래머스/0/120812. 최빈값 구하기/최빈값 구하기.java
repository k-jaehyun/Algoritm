import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxCount=0;
        for(int i=0;i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i],0)+1);
            if(maxCount == map.get(array[i])) {
                answer = -1;
            }
            if(maxCount < map.get(array[i])) {
                maxCount = map.get(array[i]);
                answer = array[i];
            }
        }
        
        
        
        return answer;
    }
}