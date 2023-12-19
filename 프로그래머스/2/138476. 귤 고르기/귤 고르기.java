import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // map에 담는다
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< tangerine.length;i++) {
            int a = tangerine[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }

        // 많은 것 부터 채워야한다
        // List로 변형
        List<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList,Collections.reverseOrder());

        for (int i=0;i< valueList.size();i++) {
            k=k-valueList.get(i);
            answer++;
            if (k<1) break;
        }
        
        return answer;
    }
}