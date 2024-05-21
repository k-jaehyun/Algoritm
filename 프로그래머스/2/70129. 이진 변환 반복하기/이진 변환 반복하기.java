class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        
        while(!s.equals("1")) {
            answer[0]++;
            int oneCnt = 0;
            String[] strArr = s.split("");
            for(String str : strArr) {
                if(str.equals("0")) {
                    answer[1]++;
                } else {
                    oneCnt++;
                }
            }
            
            String tmp = "";
            while(oneCnt!=0) {
                if(oneCnt>1) {
                    tmp = oneCnt%2 +tmp;
                    oneCnt/=2;
                } else if(oneCnt==1) {
                    tmp = oneCnt+tmp;
                    oneCnt=0;
                }
            }
            s=tmp;
        }
        
        
        
        return answer;
    }
}