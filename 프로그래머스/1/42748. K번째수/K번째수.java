import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> integerList = new ArrayList<>();

        for(int[] com : commands) {
            int a =com[0];
            int b = com[1];
            int c = com[2];

            int[] temp = new int[b-a+1];

            for(int i=a-1;i<b;i++) {
                temp[i-a+1]= array[i];
            }

            for(int i=0;i<temp.length;i++) {
                for (int j=i+1;j< temp.length;j++) {
                    if (temp[i]>temp[j]) {
                        int t = temp[j];
                        temp[j] = temp[i];
                        temp[i] = t;
                    }
                }
            }

            integerList.add(temp[c-1]);
        }

        for(int i=0;i<integerList.size();i++) {
            answer[i]=integerList.get(i);
        }

        
        
        return answer;
    }
}