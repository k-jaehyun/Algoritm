class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArray = s.split("");
            
        String a = "";
        for(int i=0;i<s.length();i++) {
            a+=sArray[i];
        }
            
        answer = Integer.valueOf(a);    
        
        return answer;
    }
}