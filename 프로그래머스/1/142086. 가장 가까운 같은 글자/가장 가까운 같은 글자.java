class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            answer[i]=-1;
        }

        for (int i=0;i<s.length();i++) {
            for (int j=i+1; j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[j]=j-i;
                }
            }
        }
        return answer;
    }
}