class Solution {
    public int[] solution(long n) {
        
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(n);
        String str = strBuilder.toString();
        
        int[] answer = new int[str.length()];
        
        for(int i=0;i<str.length();i++) {
            answer[i] = str.charAt(str.length()-i-1) -'0';
        }
        
        return answer;
    }
}