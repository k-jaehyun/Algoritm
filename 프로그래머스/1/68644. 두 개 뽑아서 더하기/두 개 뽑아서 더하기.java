import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        List<Integer> numList = new ArrayList<Integer>();
        for(Integer num : set) {
            numList.add(num);
        }
        
        Collections.sort(numList);
        int[] answer = new int[numList.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}