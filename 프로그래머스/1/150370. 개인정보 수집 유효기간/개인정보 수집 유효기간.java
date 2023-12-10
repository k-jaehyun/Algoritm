import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();

        int yearT = Integer.parseInt(today.substring(0, 4));
        int monthT = Integer.parseInt(today.substring(5, 7));
        int dayT = Integer.parseInt(today.substring(8, 10));

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            int privacyIndex = i + 1;

            for (String term : terms) {
                char termType = term.charAt(0);
                if (termType == privacy.charAt(11)) {
                    int year = Integer.parseInt(privacy.substring(0, 4));
                    int month = Integer.parseInt(privacy.substring(5, 7));
                    int day = Integer.parseInt(privacy.substring(8, 10));

                    // 약관 종료일 계산
                    day = day - 1;
                    if (day == 0) {
                        month = month - 1;
                        day = 28;
                    }

                    month = month + Integer.parseInt(term.substring(2));

                    while (month > 12) {
                        year = year + 1;
                        month = month - 12;
                    }

                    // 날짜 비교 및 폐기
                    if (yearT > year || (year == yearT && monthT > month) || (year == yearT && month == monthT && dayT > day)) {
                        result.add(privacyIndex);
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = solution.solution(today, terms, privacies);
        System.out.println(java.util.Arrays.toString(result)); // [1, 3]
    }
}
