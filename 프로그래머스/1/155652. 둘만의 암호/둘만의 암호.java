class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        char[] chars = s.toCharArray();
        char[] skipChar = skip.toCharArray();

        for (char c : chars) {
            for (int i = 0; i < index; i++) {
                c = (char) (c + 1);
                while (c > 122) {
                    c = (char) (c - 26);
                }
                for (char skC : skipChar) {
                    if (c == skC) {
                        i--;
                    }
                }
            }
            answer += c;
        }

        
        return answer;
    }
}