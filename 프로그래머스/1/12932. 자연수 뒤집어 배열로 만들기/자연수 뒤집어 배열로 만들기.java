
class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        
        String[] strArr = str.split("");

        int[] answer = new int[strArr.length];
        
        for(int i=strArr.length;i>0;i--) {
            answer[strArr.length-i] = Integer.parseInt(strArr[i-1]);
        }
        
        return answer;
    }
}