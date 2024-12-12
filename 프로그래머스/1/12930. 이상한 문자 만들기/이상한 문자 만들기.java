class Solution {
    public String solution(String s) {
        
        StringBuilder builder = new StringBuilder();

        String[] strArr = s.split("");
        
        int index=0;
        for(String str : strArr) {
            if(str.equals(" ")) {
                builder.append(str);
                index=0;
            } else if(index%2==0) {
                builder.append(str.toUpperCase());
                index++;
            } else if(index%2==1) {
                builder.append(str.toLowerCase());
                index++;
            }
        }
        
        
        return builder.toString();
    }
}