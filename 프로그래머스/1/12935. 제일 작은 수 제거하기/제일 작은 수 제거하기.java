import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int minIndex = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(i!=minIndex) {
                arrList.add(arr[i]);
            }
        }
        
        if(arrList.size()==0) {
            int[] zero = {-1};
            return zero;
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++) {
            answer[i]=arrList.get(i);
        }
        
        return answer;
    }
}