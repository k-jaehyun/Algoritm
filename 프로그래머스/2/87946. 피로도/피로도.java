class Solution {
    int answer = 0;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        
        dfs(0, dungeons, k);
        
        return answer;
    }
    
    public void dfs(int depth, int[][] dungeons, int k) {
        for(int i=0;i<dungeons.length;i++) {
            if(!visited[i] && dungeons[i][0]<=k) {
                visited[i] = true;
                dfs(depth+1, dungeons, k-dungeons[i][1]);
                visited[i] = false;
            }
        }
        
        answer = Math.max(answer,depth);
        
    }
}