class Solution {
    public int[] solution(String[] park, String[] routes) {
            int[] answer = {0,0};

            // 시작 지점을 숫자로
            int startX = 0;
            int startY = 0;

            findStartPoint:
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    if (park[i].charAt(j) == 'S') {
                        startY = i;
                        startX = j;
                        break findStartPoint;
                    }
                }
            }

            // 이동 시키기
            move:
            for (String route : routes) {
                String direction = route.substring(0, 1);
                int moving = Integer.valueOf(route.substring(2));

                int tempX=startX;
                int tempY=startY;

                for (int i =0;i<moving;i++) {
                    if (direction.equals("E")) tempX++;
                    if (direction.equals("W")) tempX--;
                    if (direction.equals("N")) tempY--;
                    if (direction.equals("S")) tempY++;

                    if (tempX>=0 && tempY>=0 && tempX<park[0].length() && tempY<park.length) {
                        if (park[tempY].charAt(tempX) == 'X') continue move;
                    }
                }

                if (tempX>=0 && tempY>=0 && tempX<park[0].length() && tempY<park.length) {
                    startX=tempX;
                    startY=tempY;
                }
            }

            answer[0]=startY;
            answer[1]=startX;

            return answer;
    }
}