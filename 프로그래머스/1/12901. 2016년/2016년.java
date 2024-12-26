class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total=0;
        for(int i=0;i<a-1;i++) {
            total+=day[i];
        }
        
        answer = week[(total+b-1)%7];
            
        return answer;
    }
}