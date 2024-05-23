class Solution {
    public long solution(int n) {
        long answer = 0;
        
        if(n==1) return 1;
        if(n==2) return 2;
        
        // 1-1  2-2  3-3  4-5  5-8
        long[] num = new long[n];
        num[0]=1;
        num[1]=2;
        for(int i=2;i<n;i++) {
            num[i]=(num[i-1]+num[i-2])%1234567;
        }
        answer = num[n-1];
        
        return answer;
    }
}