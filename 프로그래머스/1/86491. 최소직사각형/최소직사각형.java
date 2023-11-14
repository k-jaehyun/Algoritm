class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxWide =0;
        int maxHeight=0;

        for (int i = 0; i < sizes.length; i++) {

            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }

            if(maxWide<sizes[i][0]) {
                maxWide=sizes[i][0];
            }
            if (maxHeight<sizes[i][1]) {
                maxHeight=sizes[i][1];
            }

        }

        return answer = maxWide*maxHeight;
    }
}