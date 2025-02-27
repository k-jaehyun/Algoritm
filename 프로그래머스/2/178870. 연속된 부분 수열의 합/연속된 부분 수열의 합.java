class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int minL = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        
        while(right<sequence.length && left<=right) {
            sum += sequence[right];
            
            while(sum>k) {
                sum-=sequence[left];
                left++;
            }
            
            if(sum==k) {
                if(minL>right-left) {
                    answer[0]=left;
                    answer[1]=right;
                    minL=right-left;
                }
            }
            
            right++;
            
        }
        
        return answer;
    }
}