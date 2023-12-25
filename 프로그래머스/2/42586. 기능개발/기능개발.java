import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];  // 모두 0으로 초기화 되어 있음.

        // 작업 진행 상황을 모두 배열로(0 포함)
        for (int i=0;i<100;i++) {
            int index=0;
            int endIndex=0;

            // 진도를 모두 올림
            for (int j=0;j< progresses.length;j++) {
                progresses[j]+=speeds[j];
            }

            // 올라간 진도를 비교해서...
            for (int j=0;j< progresses.length;j++) {
                if (progresses[j] >= 100 && progresses[j] <= 20000) {  //진도율 100이던 애가 속도 100으로 100일 달리면 20000 (최대)
                    index++;
                    endIndex++;
                    progresses[j] = 30000; // if문을 벗어나게 아예 크게 설정
                } else if (progresses[j]<100) {
                    temp[i]=index;
                    break;
                } else {
                    endIndex++;
                }
                
                if (endIndex== progresses.length) {
                    temp[i]=index;
                }
            }
        }

        // temp에서 0 제거
        return Arrays.stream(temp).filter(a-> a!=0).toArray();
    }
}