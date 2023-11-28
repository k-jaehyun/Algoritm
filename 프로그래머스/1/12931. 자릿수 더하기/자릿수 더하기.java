import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int u = (int) Math.log10(n);

        for(int i=u;i>=0;i--) {
            int a = (int) (n/Math.pow(10,i));
            answer+=a;
            n-=a*Math.pow(10,i);
        }


        return answer;
    }
}