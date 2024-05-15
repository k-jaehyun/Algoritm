import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] result = new int[privacies.length];
        
        for (int i = 0; i < privacies.length; i++) {
            int dayPri = Integer.valueOf(privacies[i].substring(0, 4))*12*28 + Integer.valueOf(privacies[i].substring(5, 7))*28 + Integer.valueOf(privacies[i].substring(8, 10));
            for (String s : terms) {
                if (s.charAt(0) == privacies[i].charAt(11)) {
                    result[i] = Integer.valueOf(s.substring(2))*28 + dayPri-1;
                }
            }
        }
        
        int intToday = Integer.valueOf(today.substring(0, 4))*12*28 + Integer.valueOf(today.substring(5, 7))*28 + Integer.valueOf(today.substring(8, 10));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            if (intToday > result[i]) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
