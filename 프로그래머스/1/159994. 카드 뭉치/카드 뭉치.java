import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        List<String> arr1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> arr2 = new ArrayList<>(Arrays.asList(cards2));
        List<String> goalArr = new ArrayList<>(Arrays.asList(goal));


        for (String s : goalArr) {
            if(!arr1.isEmpty() && arr1.get(0).equals(s)) {
                arr1.remove(0);
                continue;
            } else if (!arr2.isEmpty() && arr2.get(0).equals(s)) {
                arr2.remove(0);
                continue;
            } else {
                answer ="No";
                break;
            }
        }
        return answer;
    }
}