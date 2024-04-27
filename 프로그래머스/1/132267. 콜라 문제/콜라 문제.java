class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a) {
            int x = n/a;
            int newN = x*b;
            answer+=newN;
            n=n-x*a+newN;
        }
        
        
        return answer;
    }
}