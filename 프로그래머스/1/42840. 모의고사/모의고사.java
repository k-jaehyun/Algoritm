import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int a=0;
        int b=0;
        int c=0;

        int[] arrA={1,2,3,4,5};
        int[] arrB={2,1,2,3,2,4,2,5};
        int[] arrC={3,3,1,1,2,2,4,4,5,5};

        for(int i=0;i<answers.length;i++) {
            if(answers[i]==arrA[i%5]) {
                a++;
            }
            if (answers[i]==arrB[i%8]) {
                b++;
            }
            if (answers[i]==arrC[i%10]) {
                c++;
            }
        }

        int[] arr = {a,b,c};
        int max=0;
        for(int i=0;i<3;i++) {
            if(max<=arr[i]) {max=arr[i];}
        }

        List<Integer> arrList = new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            if (max==arr[i]) { arrList.add(i+1);}
        }

        int[] answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++) {
            answer[i]=arrList.get(i);
        }

        return answer;
    }
}