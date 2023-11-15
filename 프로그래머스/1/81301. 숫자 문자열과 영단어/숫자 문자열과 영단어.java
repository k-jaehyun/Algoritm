class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp="";

        do {
            if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
                tmp += s.charAt(0);
                s=s.substring(1);
            } else if (-1 != s.indexOf("one") && s.indexOf("one") <2 ) {
                tmp += "1";
                s= s.substring(3);
            } else if (-1 != s.indexOf("two") && s.indexOf("two") <2) {
                tmp += "2";
                s= s.substring(3);
            } else if (-1 != s.indexOf("three") && s.indexOf("three")<2) {
                tmp += "3";
                s= s.substring(5);
            } else if (-1 != s.indexOf("four") && s.indexOf("four")<2) {
                tmp += "4";
                s= s.substring(4);
            } else if (-1 != s.indexOf("five") && s.indexOf("five")<2) {
                tmp += "5";
                s= s.substring(4);
            } else if (-1 != s.indexOf("six") && s.indexOf("six")<2) {
                tmp += "6";
                s= s.substring(3);
            } else if (-1 != s.indexOf("seven") && s.indexOf("seven")<2) {
                tmp += "7";
                s= s.substring(5);
            } else if (-1 != s.indexOf("eight") && s.indexOf("eight")<2) {
                tmp += "8";
                s= s.substring(5);
            } else if (-1 != s.indexOf("nine") && s.indexOf("nine")<2) {
                tmp += "9";
                s= s.substring(4);
            } else if (-1 != s.indexOf("zero") && s.indexOf("zero")<2) {
                tmp += "0";
                s= s.substring(4);
            }
        } while (0<s.length());


        answer=Integer.valueOf(tmp);


        return answer;
    }
}