class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        int tLen = t.length();
        
        for(int i=0;i<=tLen-pLen;i++) {
            if(Long.valueOf(t.substring(i,i+pLen)) <= Long.valueOf(p)) {
                answer++;
            }
        }

        return answer;
    }
}