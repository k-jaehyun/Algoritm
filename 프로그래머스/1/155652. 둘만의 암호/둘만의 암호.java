class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        char[] chars = s.toCharArray();

        for (char c : chars) {
            for (int i = 0; i < index; i++) {
                c += 1;
                if (c>'z') c-=26;
                if (skip.contains(String.valueOf(c))) i--;
            }
            answer += c;
        }

        
        return answer;
    }
}