class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;
        
        for(int j=0;;j++) {
            System.out.println("s : "+j);
            int max=priorities[j%len];
            for(int i=j;i<len+j;i++) {
                if(priorities[i%len]>max) {
                    max=priorities[i%len];
                    j=i;
                }
            }
            
            priorities[j%len]=0;
            answer++;
            System.out.println(j);
            
            if(j%len==location)  {
                break;
            }
        }
        
        return answer;
    }
}