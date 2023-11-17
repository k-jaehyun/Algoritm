import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j< numbers.length;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

//        List<Integer> a = set.stream().sorted().toList();

        List<Integer> sumList = new ArrayList<>(set);

        Collections.sort(sumList);


        int[] answer = new int[sumList.size()];


        for(int i=0;i<sumList.size();i++) {
            answer[i]=sumList.get(i);
        }
        return answer;
    }
}