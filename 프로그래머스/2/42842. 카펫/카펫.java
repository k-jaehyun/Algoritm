import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        Map<Integer, Integer> wholeMap = new HashMap<>();
        for (int i = 3; i <= brown + yellow; i++) {      
            int j = (brown + yellow) / i;
            if (i>=j && i * j == brown + yellow) {
                wholeMap.put(i, j);
            }
        }

        Map<Integer, Integer> yellowMap = new HashMap<>();
        for (int i = 1; i <= yellow; i++) {
            int j = (yellow) / i;
            if (i>=j && i * j == yellow) {
                yellowMap.put(i, j);
            }
        }

        for (Map.Entry<Integer, Integer> wholeEntry : wholeMap.entrySet()) {
            for (Map.Entry<Integer, Integer> yellowEntry : yellowMap.entrySet()) {
                if (wholeEntry.getKey() == yellowEntry.getKey() + 2 && wholeEntry.getValue() == yellowEntry.getValue() + 2) {
                    answer[0] = wholeEntry.getKey();
                    answer[1] = wholeEntry.getValue();
                    return answer;
                }
            }
        }
        
        return answer;
    }
}