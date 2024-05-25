class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0;i<s.length();i++) {
            
            String tmp = s;
            boolean index=true;
            while(index) {
                if(tmp.contains("()") || tmp.contains("[]") || tmp.contains("{}")) {
                    tmp=tmp.replace("()","");
                    tmp=tmp.replace("{}","");
                    tmp=tmp.replace("[]","");
                } else {
                    index=false;
                }
            }
            
            if(tmp.length()==0) answer++;
            
            StringBuilder builder = new StringBuilder();
            builder.append(s.substring(1));
            builder.append(s.substring(0,1));
            s=builder.toString();
        }
        
        return answer;
    }
}