class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char initChar = s.charAt(0);
        int repeatCnt=0;
        int isFinalCnt=0;

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==initChar) {
                isFinalCnt++;
                repeatCnt++;
                if (isFinalCnt==s.length()){
                    answer++;
                }
            } else {
                isFinalCnt++;
                repeatCnt--;
                if (repeatCnt==0) {
                    answer++;
                    if(i+1<s.length()) {
                        initChar=s.charAt(i+1);
                    }
                } else if (isFinalCnt==s.length()) answer++;
            }
        }
        
        return answer;
    }
}