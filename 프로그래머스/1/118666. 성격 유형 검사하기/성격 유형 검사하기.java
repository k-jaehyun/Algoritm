import java.util.HashMap;
import java.util.Map;


class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String,Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);

        for (int i=0;i<survey.length;i++) {
            int leftCurrentValue=map.get(Character.toString(survey[i].charAt(0)));
            int rightCurrentValue=map.get(Character.toString(survey[i].charAt(1)));
                switch (choices[i]) {
                    case 1:
                        map.put(Character.toString(survey[i].charAt(0)),leftCurrentValue+3);
                        break;
                    case 2:
                        map.put(Character.toString(survey[i].charAt(0)),leftCurrentValue+2);
                        break;
                    case 3:
                        map.put(Character.toString(survey[i].charAt(0)),leftCurrentValue+1);
                        break;
                    case 4:
                        break;
                    case 5:
                        map.put(Character.toString(survey[i].charAt(1)),rightCurrentValue+1);
                        break;
                    case 6:
                        map.put(Character.toString(survey[i].charAt(1)),rightCurrentValue+2);
                        break;
                    case 7:
                        map.put(Character.toString(survey[i].charAt(1)),rightCurrentValue+3);
                        break;
                }
        }

        StringBuilder answer = new StringBuilder();

        if (map.get("R")>=map.get("T")) {
            answer.append("R");
        } else {
            answer.append("T");
        }

        if (map.get("C")>=map.get("F")) {
            answer.append("C");
        } else {
            answer.append("F");
        }

        if (map.get("J")>=map.get("M")) {
            answer.append(("J"));
        } else {
            answer.append(("M"));
        }

        if (map.get("A")>=map.get("N")) {
            answer.append(("A"));
        } else {
            answer.append(("N"));
        }


        return answer.toString();
    }
}