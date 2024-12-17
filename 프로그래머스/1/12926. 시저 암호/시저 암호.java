class Solution {
    public String solution(String s, int n) {
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
            char a = s.charAt(i);
            
            if(a>='a' && a<='z') {
                a+=n;
                if(a>'z') {
                    a-=26;
                }
            }
            if(a>='A' && a<='Z') {
                a+=n;
                if(a>'Z') {
                    a-=26;
                }
            }
            result.append(a);
        }
        
        return result.toString();
    }
}