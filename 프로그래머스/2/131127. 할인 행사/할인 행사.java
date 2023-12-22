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
        
        for (int k=0;k<compDays;k++) {  // 회원가입 할지 비교
            int cnt = 0;
            String[] copy = wantAll.clone();  // 같으면 ""로 바꿔주면서 비교하려고 깊은복사 
            for (int i = k; i < k+sumNum; i++) {   // discount와 비교, 시작 위치
                for (int j = 0; j < copy.length; j++) {  // 원하는 물품인지 비교
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