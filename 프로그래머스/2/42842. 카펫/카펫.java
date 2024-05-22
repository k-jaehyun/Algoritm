class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int total = brown+yellow;
        
                // yellow를 만들 수 있는 가로세로
                for(int i=1;i*i<=yellow;i++) {
                    if(i*(yellow/i)==yellow) {
                        
                        if((i+2)*((yellow/i)+2)==total) {
                            answer[0]=(yellow/i)+2;
                            answer[1]=i+2;
                        }
                        
                    }
                }

        

        
        
        
        
        return answer;
    }
}