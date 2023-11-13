class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        double pInt = Double.parseDouble(p);

        for (int i = 0; i < t.length() - p.length()+1; i++) {
            String tempString = "";
            for(int j=0;j<p.length();j++) {
                tempString+=t.charAt(i+j);
            }



            if(Double.parseDouble(tempString)<=pInt) {
                answer++;
            }
        }



        return answer;
    }
}