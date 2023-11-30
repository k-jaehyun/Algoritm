import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // 각 숫자의 등장 횟수 계산
        for (char ch : X.toCharArray()) {
            xCount[ch - '0']++;
        }

        for (char ch : Y.toCharArray()) {
            yCount[ch - '0']++;
        }

        // 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();

        // 공통으로 나타나는 숫자 찾기
        for (int i = 0; i < 10; i++) {
            int commonCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < commonCount; j++) {
                result.add(i);
            }
        }

        // 공통으로 나타나는 숫자가 없으면 -1 반환
        if (result.isEmpty()) {
            return "-1";
        }

        // 결과를 내림차순으로 정렬하고 가장 큰 정수 만들기
        Collections.sort(result, Collections.reverseOrder());

        // 수정된 부분: 결과 리스트가 0으로만 이루어진 경우 "0"을 반환
        if (result.stream().allMatch(num -> num == 0)) {
            return "0";
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int num : result) {
            resultBuilder.append(num);
        }

        return resultBuilder.toString();
    }
}
