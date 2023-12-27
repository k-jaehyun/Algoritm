import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // map에 (key:위치, value:우선순위)으로 넣어놓음 (while 조건 비교를 위해)
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< priorities.length;i++) {
            map.put(i,priorities[i]);
        }

        int orderIndex = 0; // 몇번째 값을 검증할건지
        while (map.get(location)!=0) {
            int doIndex=0; // 실행할지말지
            for (int i=0;i< priorities.length;i++) {
                doIndex++;
                if (priorities[orderIndex]<priorities[i]) {  // 더 높은 우선순위가 있다면 doindex를 0으로
                    doIndex=0;
                    break;
                }
            }
            if (doIndex == priorities.length) {  // 더 높은 우선순위가 없었다면 실행
                answer++;
                map.put(orderIndex,0);  // while에서 비교를 위해 0으로 만듦
                priorities[orderIndex]=0;  // 우선순위를 0으로 만들어버림
            }
            orderIndex++;
            if (orderIndex == priorities.length) {  // 한바퀴 다 돌았으면 다시 처음으로
                orderIndex=0;
            }
        }
        
        return answer;
    }
}