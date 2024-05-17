class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] start = {0,0};
        for(int i=0;i<park.length;i++) {
            for(int j=0;j<park[i].length();j++) {
                if(park[i].charAt(j)=='S') {
                    start[0]=i;
                    start[1]=j;
                }
            }
        }
        
        loop: for(String r : routes) {
            if(r.contains("E")) {
                int tmp=start[1];
                for(int i=0;i<r.charAt(2)-'0';i++) {
                    if(tmp+1>=park[0].length() || park[start[0]].charAt(tmp+1)=='X') {
                       continue loop;
                    } else {
                        tmp+=1;
                    }
                }
                start[1]=tmp;
            } else if(r.contains("W")) {
                int tmp=start[1];
                for(int i=0;i<r.charAt(2)-'0';i++) {
                    if(tmp-1<0 || park[start[0]].charAt(tmp-1)=='X') {
                       continue loop;
                    } else {
                        tmp-=1;
                    }
                }
                start[1]=tmp;
            } else if(r.contains("S")) {
                int tmp = start[0];
                for(int i=0;i<r.charAt(2)-'0';i++) {
                    if(tmp+1>=park.length || park[tmp+1].charAt(start[1])=='X') {
                        continue loop;
                    } else {
                        tmp+=1;
                    }
                }
                start[0]=tmp;
            } else if(r.contains("N")) {
                int tmp = start[0];
                for(int i=0;i<r.charAt(2)-'0';i++) {
                    if(tmp-1<0 || park[tmp-1].charAt(start[1])=='X') {
                        continue loop;
                    } else {
                        tmp-=1;
                    }
                }
                start[0]=tmp;
            }
        }
        
        
        return start;
    }
}