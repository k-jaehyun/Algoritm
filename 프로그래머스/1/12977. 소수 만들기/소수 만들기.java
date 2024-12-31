class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        for(int i=0;i<len-2;i++) {
            for(int j=i+1;j<len-1;j++) {
                a: for(int k=j+1;k<len;k++) {
                    
                    int tmp = nums[i]+nums[j]+nums[k];
                    for(int l=2;l*l<=tmp;l++) {
                        if(tmp%l==0) {
                            continue a;
                        }
                    }
                    answer++;
                    
                }
            }
        }

        return answer;
    }
}