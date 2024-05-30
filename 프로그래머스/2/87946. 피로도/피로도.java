class Solution {
    
    public int answer=0;
    
    public int solution(int k, int[][] dungeons) {
        
        boolean[] visited = new boolean[dungeons.length];
        
        explore(k,dungeons,visited, 0);
        
        return answer;
    }
    
    public void explore(int k, int[][]dungeons, boolean[] visited, int count) {
        for(int i=0;i<dungeons.length;i++) {
            if(k>=dungeons[i][0] && !visited[i]) {
                visited[i]=true;
                explore(k-dungeons[i][1],dungeons,visited,count+1);
                visited[i]=false;
            }
            answer=Math.max(answer,count);
        }
    }
}