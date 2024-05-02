class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int x = nums[i]+nums[j]+nums[k];
                    int tmp=0;
                    for(int l=2;l*l<=x;l++) {
                        if(x%l==0) {
                            tmp++;
                            break;
                        }
                    }
                    if(tmp==0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}