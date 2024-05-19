class Solution {
    public String solution(String s) {
        
        
        String[] str = s.split(" ");
        int max = Integer.valueOf(str[0]);
        int min = Integer.valueOf(str[0]);
        for(String num : str) {
            max = Math.max(max, Integer.valueOf(num));
            min = Math.min(min, Integer.valueOf(num));
        }

        String answer = "";
        
        answer = min + " " + max;
        
        return answer;
    }
}