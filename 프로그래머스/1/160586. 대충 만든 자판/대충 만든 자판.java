class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];
        int min;
        int index;
        
        loop1: for(int i=0;i<targets.length;i++) {
            loop2: for(int j=0;j<targets[i].length();j++) {
                min=Integer.MAX_VALUE;
                loop3: for(int k=0;k<keymap.length;k++) {
                    index=0;
                    for(int l=0;l<keymap[k].length();l++) {
                        index++;
                        if(keymap[k].charAt(l)==targets[i].charAt(j)) {
                            if(index<min) {
                                min=index;
                            }
                            index=0;
                            continue loop3;
                        }
                        
                    }
                }
                answer[i]+=min;
                if(min==Integer.MAX_VALUE) {
                    answer[i]=-1;
                    continue loop1;
                }
            }
        }
        
        return answer;
    }
}