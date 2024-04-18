import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    
    int[] ints = {-1};
    
    return Arrays.stream(Arrays.stream(arr).filter(a -> a%divisor==0).toArray()).sorted().toArray().length>0? Arrays.stream(Arrays.stream(arr).filter(a -> a%divisor==0).toArray()).sorted().toArray(): ints;
  }
}