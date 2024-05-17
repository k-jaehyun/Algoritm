import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> pNum = new HashMap<>();
        Map<Integer, String> numP = new HashMap<>();
        for(int i=0;i<players.length;i++) {
            pNum.put(players[i],i);
            numP.put(i,players[i]);
        }
        
        for(String call : callings) {
            Integer callNum = pNum.get(call);
            String prePlayer = numP.get(callNum-1);
            
            pNum.put(prePlayer, callNum);
            pNum.put(call, callNum-1);
            numP.put(callNum, prePlayer);
            numP.put(callNum-1, call);
        }
        
        String[] answer = new String[players.length];
        
        for(int i=0;i<numP.size();i++) {
            answer[i]=numP.get(i);
        }
        
        
        return answer;
    }
}