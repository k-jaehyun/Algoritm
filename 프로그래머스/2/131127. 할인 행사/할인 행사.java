class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        int sumNum = 0;
        for (int num : number) {
            sumNum+=num;
        }

        // 회원등록 할지말지 고민 할 수 있는 날짜
        int compDays = discount.length - sumNum + 1;

        // 원하는 목록이 횟수만큼 모두 담긴 wantAll을 만듦
        String[] wantAll = new String[sumNum];
        int index=0;
        for (int i=0;i<want.length;i++) {
            for (int j=0;j<number[i];j++) {
                wantAll[index]=want[i];
                index++;
            }
        }

        for (int k=0;k<compDays;k++) {
            int cnt = 0;
            String[] copy = wantAll.clone();
            for (int i = k; i < k+sumNum; i++) {
                for (int j = 0; j < copy.length; j++) {
                    if (discount[i].equals(copy[j])) {
                        copy[j] = "";
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt==sumNum) answer++;
        }
        
        return answer;
    }
}