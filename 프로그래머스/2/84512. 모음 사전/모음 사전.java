import java.util.*;

class Solution {
    
    public int answer;
    public String[] words = {"A","E","I","O","U"};
    public List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        answer = 0;
        
        dfs(0,"");
        for(int i=0;i<list.size();i++) {
            if(word.equals(list.get(i))) {
                answer=i;
                break;
            }
        }
        
        return answer;
    }
    
    public void dfs(int depth, String str) {
        list.add(str);
        if(depth==5) return;
        for(int i=0;i<words.length;i++) {
            dfs(depth+1,str+words[i]);
        }
    }
}