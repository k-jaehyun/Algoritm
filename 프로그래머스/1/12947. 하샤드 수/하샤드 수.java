import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        List<Integer> intList = new ArrayList();
        
        Arrays.stream(String.valueOf(x).split("")).forEach(a -> intList.add(Integer.parseInt(a)));
        
        int sum = 0;
        for(int i=0;i<intList.size();i++) {
            sum+=intList.get(i);
        }
        
        if(x%sum == 0) answer = true;
        
        return answer;
    }
}