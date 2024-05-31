class Solution {
    
    int answer = 0;

    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum) {
            if(depth==numbers.length) {
                answer += sum==target ? 1 : 0;
            } else {
                dfs(numbers, target, depth+1, sum+numbers[depth]);
                dfs(numbers, target, depth+1, sum-numbers[depth]);
            }
    }
}