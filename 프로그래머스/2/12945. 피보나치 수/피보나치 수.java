class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long tmp2 = 0;
        long tmp1 = 1;
        for(int i=2;i<=n;i++) {
            answer = (int) (tmp1+tmp2)%1234567;
            tmp2=tmp1;
            tmp1=answer;
        }
        
        return answer;
    }
}