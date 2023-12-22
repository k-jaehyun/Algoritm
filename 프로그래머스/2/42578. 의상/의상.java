import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
     
        // 확통문제인가
        // (종류별 개수+1)을 서로 모두 곱한다음 -1 하면 return

        // 종류, 개수 맵
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0;i< clothes.length;i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer*=(entry.getValue()+1);
        }
        
        return answer-1;
    }
}