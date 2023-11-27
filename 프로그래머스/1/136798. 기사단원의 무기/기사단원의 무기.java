class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] powerArray = new int[number];

        for(int i=0;i<number;i++) {
            for(int j=1;j*j<=i+1;j++) {
                if(j*j==i+1) {
                    powerArray[i]++;
                } else if ((i+1) % j == 0) {
                    powerArray[i]+=2;
                }
            }
        }

        for(int i=0;i<number;i++) {
            if (powerArray[i]>limit) {
                powerArray[i]=power;
            }
            answer+=powerArray[i];
        }
        
        return answer;
    }
}