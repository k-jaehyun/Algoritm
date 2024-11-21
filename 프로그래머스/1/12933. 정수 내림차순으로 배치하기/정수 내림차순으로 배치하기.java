import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        
        List<Long> list = Arrays.stream(String.valueOf(n).split("")).map(a -> Long.parseLong(a)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        StringBuilder strBuilder = new StringBuilder();
        list.forEach(a -> strBuilder.append(a));
        
        return Long.parseLong(strBuilder.toString());
        
    }
}