import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // map에 (key:위치, value:값)으로 넣어놓음
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< priorities.length;i++) {
            map.put(i,priorities[i]);
        }

        int orderIndex = 0;
        while (map.get(location)!=0) {
            int doIndex=0;
            for (int i=0;i< priorities.length;i++) {
                doIndex++;
                if (priorities[orderIndex]<priorities[i]) {
                    doIndex=0;
                    break;
                }
            }
            if (doIndex == priorities.length) {
                answer++;
                map.put(orderIndex,0);
                priorities[orderIndex]=0;

            }
            orderIndex++;
            if (orderIndex == priorities.length) {
                orderIndex=0;
            }
        }
        
        return answer;
    }
}