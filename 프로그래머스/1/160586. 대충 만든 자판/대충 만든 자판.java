class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        //target 배열 하나씩
        loop1: for (int q=0;q< targets.length;q++) {

            int sumEachTouch=0;

            //"ABCD"에서 하나씩
            for (int i=0;i<targets[q].length();i++) {
                int minTouch = 1000;

                //keymap 배열 하나씩
                for (int j = 0; j < keymap.length; j++) {

                    //"ABACD"에서 하나씩
                    for (int k = 0; k < keymap[j].length(); k++) {
                        if (keymap[j].charAt(k) == targets[q].charAt(i) && (k + 1) < minTouch) {
                            minTouch = k + 1;
                            continue;
                        }
                    }
                }
                if (minTouch == 1000) {
                    answer[q] = -1;
                    continue loop1;
                }
                sumEachTouch+=minTouch;
            }
                answer[q] = sumEachTouch;
        }
        
        return answer;
    }
}