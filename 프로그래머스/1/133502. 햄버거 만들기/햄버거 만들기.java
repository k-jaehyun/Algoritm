import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i : ingredient) {
            list.add(i);
        }
        
        for(int i=3;i<list.size();i++) {
            if(list.size()<4) {
                break;
            }
            if(list.get(i)==1 && list.get(i-1)==3 && list.get(i-2)==2 && list.get(i-3)==1) {
                answer++;
                list.remove(i);
                list.remove(i-1);
                list.remove(i-2);
                list.remove(i-3);
                i-=3;
            }
        }
        
        return answer;
    }
}