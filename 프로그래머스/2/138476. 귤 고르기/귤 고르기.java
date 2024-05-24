import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            list.add(num);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0;i<list.size();i++) {
            k-=list.get(i);
            answer++;
            if(k<=0) {
                break;
            }
        }
        
        
        return answer;
    }
}