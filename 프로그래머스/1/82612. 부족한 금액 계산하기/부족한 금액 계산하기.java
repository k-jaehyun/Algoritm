    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;

            long totalPrice = 0;

            for(int i=1;i<count+1;i++) {
                totalPrice+=price*i;
            }
            if (money-totalPrice>=0) {
                answer = 0;
            } else {
                answer = -(money-totalPrice);
            }

            return answer;
        }
    }