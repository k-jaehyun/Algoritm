class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int[] dayOfMonths = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        int moonthSum=0;

        for(int i=0;i<a-1;i++) {
            moonthSum+=dayOfMonths[i];
        }
        answer=week[(moonthSum+b-1)%7];
        
        return answer;
    }
}