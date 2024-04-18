import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int max=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i],0)+1);
            if (map.get(array[i]) > max) {
                max=map.get(array[i]);
                answer=array[i];
            } else if(map.get(array[i]) == max) {
                answer = -1;
            }
        }
        
        return answer;
    }
}