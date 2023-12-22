class Solution {
    public int solution(int a, int b) {
        int answer = 0;

       // a () b
        int a_b = 1;
        for (int i=1;i<10000;i*=10) {
            if (b/i==0) {
                break;
            }
            a_b*=10;
        }
        a_b = a*a_b + b;

        // b () a
        int b_a = 1;
        for (int i=1;i<10000;i*=10) {
            if (a/i==0) {
                break;
            }
            b_a*=10;
        }
        b_a = b*b_a + a;

        answer = Math.max(a_b,b_a);
        
        return answer;
    }
}