import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 동일한 신고내역 제거
        String[] repo = Arrays.stream(report).distinct().toArray(String[]::new);

        // 맵에 신고자-신고내역 으로 저장
        Map<String, List<String>> repoMap = new HashMap<>();
            for (int j = 0; j < repo.length; j++) {
                String a = repo[j].split(" ")[0];
                String b = repo[j].split(" ")[1];

                // 비어있다면 put 아니면 더해줌
                repoMap.computeIfAbsent(a, value -> new ArrayList<>()).add(b);
            }

        // 신고내역 확인하며 카운트
        Map<String, Integer> countMap = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : repoMap.entrySet()) {
            entry.getValue().stream().forEach(a -> {
                if (countMap.get(a) == null) {
                    countMap.put(a, 1);
                } else {
                    countMap.put(a, countMap.get(a) + 1);
                }
            });
        }

        // id_list의 이름으로 신고한 사람 중 카운트가 k이상인 것의 개수만큼 ++
        int[] result=new int[id_list.length];

        int i=0;
        for (String s : id_list) {
            List<String> stringList = repoMap.getOrDefault(s,null);

            if (stringList!=null) {
                int finalI = i;
                stringList.stream().forEach(a-> {
                    if (countMap.get(a)>=k) {
                        result[finalI]++;
                    }
                });
            }
            i++;
        }

        return result;
    }
}