class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long[] longs = new long[n+1];

        longs[0]=0;
        longs[1]=1;

        for (int i=2;i< longs.length;i++) {
            longs[i]=(longs[i-1]+longs[i-2])%1234567;
        }

        answer=(int) (longs[n]%1234567);
        
        return answer;
    }
}