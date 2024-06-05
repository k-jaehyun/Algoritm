import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] ans = new int[numbers.length];
        PriorityQueue<int[]> q = new PriorityQueue<>(
                (o1,o2) ->(o1[1] - o2[1]));
        for(int i = 0; i < numbers.length; i++) {
            q.add(new int[] {i,numbers[i]});
            while(q.peek()[1] < numbers[i]) {
                int[] temp = q.poll();
                ans[temp[0]] = numbers[i];
            }
        }
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            ans[temp[0]] = -1;
        }
        return ans;
    }
}