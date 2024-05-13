import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {        
        
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
        
        for(int i=0;i<survey.length;i++) {
            if(choices[i]==7) {
                map.put(survey[i].substring(1,2), map.getOrDefault(survey[i].substring(1,2),0)+3);
            } else if(choices[i]==6) {
                map.put(survey[i].substring(1,2), map.getOrDefault(survey[i].substring(1,2),0)+2);
            } else if(choices[i]==5) {
                map.put(survey[i].substring(1,2), map.getOrDefault(survey[i].substring(1,2),0)+1);
            } else if(choices[i]==3) {
                map.put(survey[i].substring(0,1), map.getOrDefault(survey[i].substring(0,1),0)+1);
            } else if(choices[i]==2) {
                map.put(survey[i].substring(0,1), map.getOrDefault(survey[i].substring(0,1),0)+2);
            } else if(choices[i]==1) {
                map.put(survey[i].substring(0,1), map.getOrDefault(survey[i].substring(0,1),0)+3);
            }
        }
        
        if(map.get("R")>=map.get("T")) {
            answer+="R";
        } else {
            answer+="T";
        }

        if(map.get("C")>=map.get("F")) {
            answer+="C";
        } else {
            answer+="F";
        }

        if(map.get("J")>=map.get("M")) {
            answer+="J";
        } else {
            answer+="M";
        }

        if(map.get("A")>=map.get("N")) {
            answer+="A";
        } else {
            answer+="N";
        }

        return answer;
    }
}