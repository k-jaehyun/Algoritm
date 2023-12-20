import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for (int rank=citations.length;rank>0;rank--) {
            if (rank<=citations[citations.length-rank]) {
                answer=rank;
                break;
            }
        }
        
        return answer;
    }
}