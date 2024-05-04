class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int cnt=0;
        int x=0;
        
        for(int i=0;i<6;i++) {
            if(lottos[i]!=0) {
                loof1: for(int j=0;j<6;j++) {
                    if(lottos[i]==win_nums[j]) {
                        cnt++;
                        break loof1;
                    }
                }
            } else{
            x++;
                
            }
        }
        
        x+=cnt;
        
        switch(x) {
            case 6: 
                    answer[0]=1;
                break;
            case 5:
                    answer[0]=2;
                break;
            case 4:
                    answer[0]=3;
                break;
            case 3:
                    answer[0]=4;
                break;
            case 2:
                    answer[0]=5;
                break;
            case 1:
            case 0:
                    answer[0]=6;
                break;
        }        
        
                switch(cnt) {
                    case 6:
                    answer[1]=1;
                break;
                    case 5:
                    answer[1]=2;
                break;
                    case 4:
                    answer[1]=3;
                break;
                    case 3:
                    answer[1]=4;
                break;
                    case 2:
                    answer[1]=5;
                break;
                    case 1:
                    case 0:
                    answer[1]=6;
                break;
        }     
        
        return answer;
    }
}