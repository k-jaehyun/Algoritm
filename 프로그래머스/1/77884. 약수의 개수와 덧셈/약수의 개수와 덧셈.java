class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num = 0;
        
        for(int i=left;i<=right;i++) {
            num=0;
            
            // 약수의 개수 구하기
            for(int j=1;j*j<=i;j++) {
                if(i%j==0) {
                    if(j*j!=i) {
                        num+=2;                        
                    } else {
                        num+=1;
                    }
                }
            }
            
            // 약수의 개수에 따라 더하거나 뺀다
            if(num%2==0) {
                answer+=i;
            } else {
                answer-=i;
            }
        }
        
        return answer;
    }
}