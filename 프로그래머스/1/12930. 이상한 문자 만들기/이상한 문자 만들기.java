    class Solution {
        public String solution(String s) {
        boolean evenOrNot = true;
        char[] charArray = new char[s.length()];


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                charArray[i] = s.charAt(i);
                evenOrNot = true;
            } else {
                if (evenOrNot) {
                    charArray[i] = 'A' <= s.charAt(i) && s.charAt(i) <= 'Z' ? s.charAt(i) : (char) (s.charAt(i) - 32);
                    evenOrNot = false;
                } else {
                    charArray[i] = 'a' <= s.charAt(i) && s.charAt(i) <= 'z' ? s.charAt(i) : (char) (s.charAt(i) + 32);
                    evenOrNot = true;
                }
            }
        }
        return String.valueOf(charArray);
        }
    }