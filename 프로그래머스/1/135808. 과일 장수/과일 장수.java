import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
         List<Integer> arr = new ArrayList<>();

        for (int i : score) {
            arr.add(i);
        }

//        while(arr.size()>=m) {
//            int boxLast=0;
//            int count=0;
//            for (int i=0;i<m;i++) {
//                if (!arr.isEmpty()) {
//                    boxLast = arr.get(0);
//                    arr.remove(0);
//                    count++;
//                }
//            }
//            answer+=boxLast*count;
//        }

        Collections.sort(arr,Collections.reverseOrder());

        int boxes = arr.size() / m;

        for (int i = 1; i < boxes+1; i++) {
            int boxLast = arr.get((i * m)-1);
            answer += boxLast * m;
        }
        
        
        
        return answer;
    }
}