import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int index=0;
        List<Integer> list = new ArrayList<>();
        
        while(index<progresses.length) {
            int tmp=0;
            for(int i=0;i<progresses.length;i++) {
                progresses[i] += speeds[i];
            }
            for(int i=0;i<progresses.length;i++) {
                if(progresses[i]<100) {
                    break;
                }
                tmp++;
            }
            
            if(tmp!=index) {
                list.add(tmp-index);
            }
            index=tmp;
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}