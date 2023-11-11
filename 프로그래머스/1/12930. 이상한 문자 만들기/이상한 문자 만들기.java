    class Solution {
        public String solution(String s) {
        boolean evenOrNot = true;
        String[] array = s.split("");
        String answer="";

        for(String a : array) {
            a = a.equals(" ") ? a : (evenOrNot ? a.toUpperCase() : a.toLowerCase());
            evenOrNot= a.equals(a.toLowerCase());
            answer+=a;
        }
        
        return answer;
        }
    }