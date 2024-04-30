import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, 0};
        int min = Integer.MAX_VALUE;
        
        int start = 0;
        int end = 0;
        int sum = 0;
        
        while (start < sequence.length) {
            // 현재 부분 배열의 합이 k보다 작으면 end 포인터를 오른쪽으로 이동하여 부분 배열을 확장
            while (end < sequence.length && sum < k) {
                sum += sequence[end];
                end++;
            }
            
            // 현재 부분 배열의 합이 k와 같고, 길이가 최소인 경우
            if (sum == k && (end - start) < min) {
                min = end - start;
                answer[0] = start;
                answer[1] = end - 1;
            }
            
            // 현재 부분 배열의 합이 k보다 크거나 같으면 start 포인터를 오른쪽으로 이동하여 부분 배열을 축소
            sum -= sequence[start];
            start++;
        }
        
        // 부분 배열이 존재하지 않는 경우 처리
        if (min == Integer.MAX_VALUE) {
            return new int[]{};
        }
        
        return answer;
    }
}
