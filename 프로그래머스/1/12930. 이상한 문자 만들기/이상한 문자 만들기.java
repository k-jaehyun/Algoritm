class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=' ' && index%2==0) {
                answer+= Character.toUpperCase(s.charAt(i));
                index++;
            } else if(s.charAt(i)!=' ' && index%2!=0) {
                answer+= Character.toLowerCase(s.charAt(i));
                index++;
            } else {
                answer+= s.charAt(i);
                index=0;
            }
        }
        
        return answer;
    }
}