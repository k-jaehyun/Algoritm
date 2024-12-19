import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        return Arrays.stream(strings).sorted((a,b) -> {
            if(a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n), b.charAt(n));
        }).toArray(String[]::new);

    }
}