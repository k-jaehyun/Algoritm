import java.util.*;

class Solution {
    public int[] solution(long n) {
        
return new StringBuilder().append(n).reverse().chars()
				.map(a -> Integer.parseInt(String.valueOf((char)a))).toArray();
    }
}