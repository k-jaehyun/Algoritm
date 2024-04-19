class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length()/2;
        
        if(s.length()%2==1) { // 홀수개 일 때
            answer = s.charAt(mid)+"";
        } else { // 짝수개 일 때
            answer = s.charAt(mid-1)+""+s.charAt(mid)+"";            
        }
        
        return answer;
    }
}