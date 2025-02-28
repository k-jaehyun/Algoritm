import java.util.*;

class Solution {
    
    public Set<Integer> set = new HashSet<>();
    public boolean[] visited;
    public String[] numberArr;
    public int answer = 0;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        numberArr = numbers.split("");
        dfs(0, "");
        
        a: for(int n:set) {
            if(n==0 || n==1) {
                continue a;
            }
            for(int i=2;i*i<=n;i++) {
                if(n%i==0) {
                    continue a;
                }
            }
            answer++;
        }
        
        return answer;
    }
    
    public void dfs(int depth, String word) {
        for(int i=0;i<numberArr.length;i++) {
            if(!visited[i]) {
                visited[i] = true;
                set.add(Integer.valueOf(word+numberArr[i]));
                dfs(depth+1, word+numberArr[i]);
                visited[i] = false;
            }
        }
    }
}