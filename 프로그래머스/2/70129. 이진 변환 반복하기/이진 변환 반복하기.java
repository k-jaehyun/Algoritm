import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};

        final String[] strArr = {s};

        int excuCnt=0;
        final int[] zeroCnt = {0};

        while (!strArr[0].equals("1")) {
            excuCnt++;

            String[] tempstr={""};

            Arrays.stream(strArr[0].split("")).forEach(a -> {
                if (a.equals("0")) { zeroCnt[0]++; }
                else { tempstr[0] += "1"; }
            });

            strArr[0] = Integer.toBinaryString(tempstr[0].length());
        }
        
        answer[0]=excuCnt;
        answer[1]=zeroCnt[0];

        return answer;
    }
}