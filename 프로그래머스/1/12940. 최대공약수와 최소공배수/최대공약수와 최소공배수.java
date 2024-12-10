class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        
        for(int i=1;i<=min;i++) {
            if(n%i==0 && m%i==0) {
                answer[0] = i;
                answer[1] = n*m/i;
            }
        }
        
        return answer;
    }
}