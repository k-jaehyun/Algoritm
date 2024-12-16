class Solution {
    public int solution(int[][] sizes) {
        
        int x = 0;
        int y = 0;
        
        for(int i=0;i<sizes.length;i++) {
            int a = Math.max(sizes[i][0],sizes[i][1]);
            int b = Math.min(sizes[i][0],sizes[i][1]);
            if(a > x) {
                x = a;
            }
            if(b > y) {
                y = b;
            }
        }
        
        return x*y;
    }
}