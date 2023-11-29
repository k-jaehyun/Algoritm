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
        switch (yesCnt[0]) {
            case 6:
                answer[0]=1;
                break;
            case 5:
                answer[0]=2;
                break;
            case 4:
                answer[0]=3;
                break;
            case 3:
                answer[0]=4;
                break;
            case 2:
                answer[0]=5;
                break;
            default:
                answer[0]=6;
        }
        switch (yesCnt[1]) {
            case 6:
                answer[1]=1;
                break;
            case 5:
                answer[1]=2;
                break;
            case 4:
                answer[1]=3;
                break;
            case 3:
                answer[1]=4;
                break;
            case 2:
                answer[1]=5;
                break;
            default:
                answer[1]=6;
        }

        return answer;
    }
}