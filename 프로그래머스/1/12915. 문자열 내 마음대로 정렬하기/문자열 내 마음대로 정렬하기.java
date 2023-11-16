import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b); // 사전순으로 앞선 문자열이 앞쪽에 위치하도록 정렬
            } else {
                return Character.compare(a.charAt(n), b.charAt(n));
            }
        });

        return strings;
    }
}
