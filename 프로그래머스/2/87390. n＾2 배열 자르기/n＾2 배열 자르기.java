class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[(int) (right-left+1)];

        int index=0;
        for (long i=left;i<=right;i++) {
            int a = (int)(i/n)+1;
            int b = (int)(i%n)+1;
            answer[index]=Math.max(a,b);
            index++;
        }


        return answer;
    }
}