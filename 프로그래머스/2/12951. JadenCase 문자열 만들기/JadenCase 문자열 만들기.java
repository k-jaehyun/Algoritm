class Solution {
    public String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");

        // char[] 변환
        char[] sCharArray= s.toCharArray();

        // 첫 문자인지 판별하는 index
        int index=0;
        for (int i=0;i<s.length();i++) {
            if (sCharArray[i]==' ') {  //공백이면 index를 0으로 
                index=0;
            } else if (index==0) {  
                if (sCharArray[i]<='z' && sCharArray[i]>='a') {  // 공백이 아니고 첫 문자일 때 대문자로
                    sCharArray[i]-=32;
                }
                index++;   // 공백이 아니기때문에 index를 올려줌
            } else {
                if (sCharArray[i]<='Z' && sCharArray[i]>='A') {  // 첫문자가 아닐 때 대문자면 소문자로
                    sCharArray[i]+=32;
                }
                index++;   // 공백이 아니기때문에 index를 올려줌
            }
        }

        answer=String.valueOf(sCharArray);

        return answer;
    }
}