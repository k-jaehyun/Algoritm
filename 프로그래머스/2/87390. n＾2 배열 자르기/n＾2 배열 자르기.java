class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right-left+1);
        
        int[] answer = new int[len];

        for(int i=0;i<len;i++) {
            // x%n : 열
            // x/n +1 : 행
            answer[i]= (int) Math.max((left+i)%n+1, (left+i)/n+1);
        }
        
        return answer;
    }
}