class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxA = 0;
        int maxB = 0;
        
        
        for(int i=0;i<sizes.length;i++) {
            // 큰 수가 뒤로가게 정렬
            if(sizes[i][0]>sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
            
            // 제일 큰 수 찾기
            maxA = maxA<sizes[i][0] ? sizes[i][0] : maxA;
            maxB = maxB<sizes[i][1] ? sizes[i][1] : maxB;
        }
        
        return maxA*maxB;
    }
}