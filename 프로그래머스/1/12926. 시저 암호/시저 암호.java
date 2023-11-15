class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
                    for (int i=0;i<s.length();i++) {
                if(s.charAt(i)==' ') {
                    answer+=" ";
                } else if (s.charAt(i)<='Z') {
                    if (s.charAt(i)+n<=90) {
                        answer+=Character.toString((s.charAt(i)+n));
                    }
                    else answer+=Character.toString((s.charAt(i)+n-26));
                } else {
                    if (s.charAt(i)+n<=122) {
                        answer+=Character.toString((s.charAt(i)+n));
                    }
                    else answer+=Character.toString((s.charAt(i)+n-26));
                }
            }
        
        return answer;
    }
}