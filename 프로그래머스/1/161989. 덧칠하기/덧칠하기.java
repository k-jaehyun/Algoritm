class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=1;
        }

        for(int i=0;i< section.length;i++) {
            arr[section[i]-1]=0;
        }

        for(int i=0;i<n-m;i++) {
            if(arr[i]==0) {
                for(int j=i;j<m+i;j++) {
                    arr[j]=1;
                }
                answer++;
            }
        }
        for(int i=n-m;i<n;i++) {
            if(arr[i]==0) {
                answer++;
                break;
            }
        }
        
        return answer;
    }
}