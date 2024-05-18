import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> id_report = new HashMap<>();
        for(String id : id_list) {
            id_report.put(id,new HashSet<>());
        }
        for(String repo : report) {
            String[] str = repo.split(" ");
            id_report.get(str[0]).add(str[1]);
        }
        
        Map<String, Integer> reportedNum = new HashMap<>();
        for(int i=0;i<id_list.length;i++) {
            for(String s : id_report.get(id_list[i])) {
                    reportedNum.put(s,reportedNum.getOrDefault(s,0)+1);
            }
        }
        
        for(int i=0;i<id_list.length;i++) {
            for(String s : id_report.get(id_list[i])) {
                if(reportedNum.get(s) >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}