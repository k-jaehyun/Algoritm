class Solution {
    public int[] solution(String s) {
        
        int count=0;
        int indexZero=0;
        
        while(!s.equals("1")) {
            
            // 0 제거
            String[] strArr = s.split("");
            StringBuilder strBuilder = new StringBuilder();
            for(int i=0;i<strArr.length;i++) {
                if(!strArr[i].equals("0")) {
                    strBuilder.append(strArr[i]);
                } else {
                    indexZero++;
                }
            }
            s = strBuilder.toString();
            
            // 2진수로 나타내기
            int a = s.length();
            StringBuilder strB = new StringBuilder();
            while(a>1) {
                strB.append(a%2);
                a/=2;
            }
            strB.append(a);
            strB.reverse();
            s = strB.toString();
            
            count++;
        }
        
        int[] answer = {count,indexZero};
        
        return answer;
    }
}