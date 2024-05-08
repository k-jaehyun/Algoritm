class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] students = new int[n];
        
        for(int i=0;i<n;i++) {
            students[i]=1;
        }
        
        for(int i=0;i<lost.length;i++) {
            students[lost[i]-1]--;
        }
        
        for(int i=0;i<reserve.length;i++) {
            students[reserve[i]-1]++;
        }
        
        for(int i=0;i<n;i++) {
            if(students[i]==0) {
                if(i-1>=0 && students[i-1]==2) {
                    students[i-1]--;
                    students[i]++;
                } else if(i+1<n && students[i+1]==2) {
                    students[i+1]--;
                    students[i]++;
                }
            }
        }
        
        for(int num : students) {
            if(num>=1) {
                answer++;
            }
        }
        
        return answer;
    }
}