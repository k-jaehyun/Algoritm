import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int num =0;
        
        int[] elements2 = new int[elements.length*2];
        for(int i=0;i<elements.length;i++) {
            elements2[i] = elements[i];
            elements2[i+elements.length] = elements[i];
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<elements.length;i++) {
            for(int j=i;j<i+elements.length;j++) {
                num += elements2[j];
                set.add(num);
            }
            num=0;
        }
        
        answer = set.size();
        
        return answer;
    }
}