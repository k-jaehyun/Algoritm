import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        int end = 0;
        while(end<progresses.length) {
            int tmp=0;
            for(int i=0;i<progresses.length;i++) {
                progresses[i] += speeds[i];
            }
            for(int i=0;i<progresses.length;i++) {
                if(progresses[i]>=100) {
                    if(progresses[i]>=10000) {
                        continue;
                    }
                    end++;
                    tmp++;
                    progresses[i]=10000;
                    continue;
                }
                break;
            }
            
            if(tmp!=0) {
                list.add(tmp);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}