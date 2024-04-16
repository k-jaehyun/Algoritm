import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        int m = (int) Math.log10(n);
        System.out.println(m);
        
        for(int i=m+1;i>0;i--) {
            int q = n / (int) Math.pow(10,i-1);
            answer+=q;
        System.out.println(q);
            
            n=n- (int)(Math.pow(10,i-1)*q);
        // System.out.println(n);
        
        }

        return answer;
    }
}