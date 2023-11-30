class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n];

        // 강탈
        for (int i=0;i<lost.length;i++) {
            students[lost[i]-1]--;
        }

        // 더 있는애들
        for (int i=0;i< reserve.length;i++) {
            students[reserve[i]-1]++;
        }
        
        //빌려옴
        if (students[0]<0 && students[1]>0) {
            students[0]++;
            students[1]--;
        }
        for (int i=1;i<n-1;i++) {
            if(students[i]<0) {
                if(students[i-1]>0) {
                    students[i]++;
                    students[i-1]--;
                } else if (students[i+1]>0) {
                    students[i]++;
                    students[i+1]--;
                }
            }
        }
        if (students[n-1]<0 && students[n-2]>0) {
            students[n-1]++;
            students[n-2]--;
        }
        
        // 0 이상인 애들 카운트
        for (int s : students) {
            if (s>=0) answer++;
        }
        
        return answer;
    }
}