import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        
        int n1=0;
        int n2=0;
        int n3=0;
        
        for(int i=0;i<answers.length;i++) {
            if(s1[i%5]==answers[i]) n1++;
            if(s2[i%8]==answers[i]) n2++;
            if(s3[i%10]==answers[i]) n3++;
        }
        
        int[] numArr = {n1,n2,n3};
        
        int max=0;
        for(int i=0;i<numArr.length;i++) {
            if(numArr[i]>max) max=numArr[i];
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numArr.length;i++) {
            if(max==numArr[i]) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}