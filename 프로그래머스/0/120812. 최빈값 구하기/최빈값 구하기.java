import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int max=0;
        int cnt=0;
        int index=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i],0)+1);
            if (map.get(array[i]) > max) {
                max=map.get(array[i]);
                answer=array[i];
                index = 0;
            } else if(map.get(array[i]) == max) {
                index = -1;
            }
        }
        
        return index == -1? index:answer;
    }
}