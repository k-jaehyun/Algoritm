class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0;i<t.length()-p.length()+1;i++) {
            if(Double.parseDouble(t.substring(i,i+p.length()))<=Double.parseDouble(p)) {
                answer++;
            }
            
        }

        return answer;
    }
}