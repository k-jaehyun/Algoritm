class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i=0;i<food.length-1;i++) {
            for(int j=0;j<food[food.length-1-i]/2;j++) {
                answer= (food.length-1-i) + answer + (food.length-1-i);
            }
        }
        
        return answer;
    }
}