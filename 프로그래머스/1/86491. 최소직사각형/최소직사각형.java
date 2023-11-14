class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxWide =0;
        int maxHeight=0;

        for (int[] s : sizes) {
            maxWide=Math.max(maxWide,Math.max(s[0],s[1]));
            maxHeight=Math.max(maxHeight,maxHeight = Math.min(s[0],s[1]));
        }

        return answer = maxWide*maxHeight;
    }
}