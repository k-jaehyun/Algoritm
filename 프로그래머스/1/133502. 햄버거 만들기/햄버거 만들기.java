class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

       StringBuilder result = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            result.append(ingredient[i]);

            if (result.length()>3) {
                if (result.charAt(result.length()-1)=='1'
                && result.charAt(result.length()-2)=='3'
                && result.charAt(result.length()-3)=='2'
                && result.charAt(result.length()-4)=='1'
                ) {
                    answer++;
                    result = new StringBuilder(result.substring(0,result.length()-4));
                }
            }
        }


        
        return answer;
    }
}