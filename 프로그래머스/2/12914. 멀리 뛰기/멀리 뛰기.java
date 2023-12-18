class Solution {
    public long solution(int n) {
        long answer = 0;
        if (n==1) return 1;
        if (n==2) return 2;

        // 1 - 1   2 - 2   3 - 3  4 - 5  5 - 8

        // n = n-1 + n-2
        long[] longs = new long[n+1];

        longs[1]=1;
        longs[2]=2;

        for (int i=3;i< longs.length;i++) {
            longs[i]=(longs[i-1]+longs[i-2])%1234567;
        }

        answer=longs[n];

        return answer;
    }
}