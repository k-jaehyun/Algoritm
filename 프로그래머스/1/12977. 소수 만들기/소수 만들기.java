class Solution {
    public int solution(int[] nums) {
        int answer = -1;

        int tmp=0;
        int count=0;

        for(int i=0;i< nums.length;i++) {
            for(int j=i+1;j< nums.length;j++) {
                Loop1: for (int k=j+1;k< nums.length;k++) {
                    tmp = nums[i]+nums[j]+nums[k];
                    for(int l=2;l<tmp;l++) {
                        if(tmp%l==0) {
                            continue Loop1;
                        }
                    }
                    count++;
                }
            }
        }
        
        answer=count;

        return answer;
    }
}