import java.util.Arrays;

class Solution {
    public String solution(String s) {
        return (Arrays.stream(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()).min().orElse(0)+"")+" "+(Arrays.stream(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()).max().orElse(0)+"");

    }
}