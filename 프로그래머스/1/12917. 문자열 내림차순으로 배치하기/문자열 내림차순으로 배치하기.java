import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public String solution(String s) {
        String answer = "";
    answer = Arrays.stream(s.split("")).map(a->a.charAt(0)).sorted(Comparator.reverseOrder()).map(a->a+"").collect(Collectors.joining());


        
        return answer;
    }
}