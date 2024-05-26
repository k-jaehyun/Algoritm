class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int i=0;i<citations.length;i++) {
            int index=0;
            for(int j=0;j<citations.length;j++) {
                if(citations[i]<=citations[j]) {
                    index++;
                }
            }
            index=Math.min(citations[i],index);
            answer=Math.max(answer,index);
        }
        
        return answer;
    }
}