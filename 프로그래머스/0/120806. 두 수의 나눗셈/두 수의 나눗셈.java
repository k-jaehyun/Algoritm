class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double tmp=0;
        
        tmp = (double)num1/num2;
        answer = (int)(tmp*1000);
        
        return answer;
    }
}