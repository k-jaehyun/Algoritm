class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tr = "";
        
        while(n>=3) {
            tr+=n%3;
            n/=3;
        }
        tr+=n;
        
        for(int i=0;i<tr.length();i++) {
            answer+=(tr.charAt(tr.length()-i-1)-'0') * Math.pow(3,i);
        }
        
        return answer;
    }
}