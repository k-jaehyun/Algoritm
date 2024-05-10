class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            int add = index;
            
            while(add > 0) {
                currentChar = (char) (currentChar + 1);
                if(currentChar > 'z') {
                    currentChar = 'a';
                }
                
                if(skip.indexOf(currentChar) == -1) {
                    add--;
                }
            }
            
            answer.append(currentChar);
        }
        
        return answer.toString();
    }
}
