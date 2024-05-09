class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char tmp = '0';
        int cntTmp = 0;
        int cnt = 0;
        
        for(char c : s.toCharArray()) {
            if(tmp=='0') {
                tmp=c;
                cntTmp++;
            } else if(tmp==c) {
                cntTmp++;
            } else {
                cnt++;
            }
            if(cnt==cntTmp) {
                tmp='0';
                cnt=0;
                cntTmp=0;
                answer++;
            }
        }
        if(tmp!='0') {
            answer++;
        }
        return answer;
    }
}