class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 0인 배열(벽) 만들고 칠해야하는 부분을 1로
        int[] arr = new int[n];
        for(int i=0;i<section.length;i++) {
            arr[section[i]-1] = 1;
        }
        
        // 1인지 확인 후 m만큼 칠한다
        for(int i=0;i<=n-m;i++) {
            if(arr[i]==1) {
                answer++;
                for(int j=i;j<i+m;j++) {
                    arr[j]=0;
                }
                i+=m-1;
            }
        }
        
        // 끝부분 확인
        for(int i=n-m;i<n;i++) {
            if(arr[i]==1) {
                answer++;
                break;
            }
        }
        
        
        return answer;
    }
}