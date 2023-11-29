class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      int cnt=0;

        // 0을 제외하고 당첨된 번호의 개수
        for(int i=0;i<lottos.length;i++) {
            for (int j=0;j< win_nums.length;j++) {
                if (lottos[i]==win_nums[j]) {
                        cnt++;
                }
            }
        }

        int lottosZeroCnt=0;

        // 0의 개수
        for(int i=0;i< lottos.length;i++) {
            if (lottos[i]==0) {
                lottosZeroCnt++;
            }
        }

        // 당첨 개수 카운트
        int[] yesCnt = new int[2];
        yesCnt[0]=cnt+lottosZeroCnt;
        yesCnt[1]=cnt;

        int[] answer = new int[2];
        answer[0]=7-yesCnt[0];
        answer[1]=7-yesCnt[1];

        if(answer[0]>6) answer[0]=6;
        if(answer[1]>6) answer[1]=6;

        return answer;
    }
}