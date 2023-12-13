class Solution {
    public String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");

        char[] sCharArray= s.toCharArray();

        int index=0;
        for (int i=0;i<s.length();i++) {
            if (sCharArray[i]==' ') {
                index=0;
            } else if (index==0) {
                if (sCharArray[i]<='z' && sCharArray[i]>='a') {
                    sCharArray[i]-=32;
                }
                index++;
            } else {
                if (sCharArray[i]<='Z' && sCharArray[i]>='A') {
                    sCharArray[i]+=32;
                }
                index++;
            }
        }

        answer=String.valueOf(sCharArray);

        return answer;
    }
}