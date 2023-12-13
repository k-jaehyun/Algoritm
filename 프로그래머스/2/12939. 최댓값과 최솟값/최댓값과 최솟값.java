import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        int max = Arrays.stream(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()).max().orElse(0);
        int min = Arrays.stream(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()).min().orElse(0);
        
        answer=(min+"")+" "+(max+"");
        
        return answer;
    }
}