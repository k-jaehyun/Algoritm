import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while(n>0) {
            list.add(n%3);
            n=n/3;
        }
        
        int size = list.size();
        
        for(int i=0;i<size;i++) {
            int temp = 1;
            for(int j=i+1;j<size;j++) {
                temp*=3;
            }
            answer+=temp*list.get(i);
        }
        
        return answer;
    }
}