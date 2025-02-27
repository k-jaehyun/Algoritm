class Solution {
    int tar = 0;
    int answer = 0;
    public int solution(int[] numbers, int target) {
        tar = target;
        int sum = 0;
        
        dfs(0, sum, numbers);
        
        return answer;
    }
    
    public void dfs(int depth, int sum, int[] numbers) {
        if(depth==numbers.length) {
            if(sum == tar) {
                answer++;
            }
        } else {
            dfs(depth+1, sum+numbers[depth], numbers);
            dfs(depth+1, sum-numbers[depth], numbers);
        }
        
    }
}