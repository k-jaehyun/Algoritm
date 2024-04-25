import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++) {
            List<Integer> comArr = new ArrayList<Integer>();
            for(int j=0;j<commands[i][1]-commands[i][0]+1;j++) {
                comArr.add(array[commands[i][0]+j-1]);
            }
            Collections.sort(comArr);
            answer[i] = comArr.get(commands[i][2]-1);
        }
        
        return answer;
    }
}