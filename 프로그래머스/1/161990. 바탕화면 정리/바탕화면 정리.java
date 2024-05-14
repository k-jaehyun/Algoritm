class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {0,0,0,0};
        
        // 맨 윗 점 lux
        for(int i=0;i<wallpaper.length;i++) {
            if(wallpaper[i].contains("#")) {
                answer[0]=i;
                break;
            }
        }
        
        // 맨 왼쪽 점 luy
        int minX=Integer.MAX_VALUE;
        for(int i=0;i<wallpaper.length;i++) {
            for(int j=0;j<wallpaper[i].length();j++) {
                if(wallpaper[i].charAt(j)=='#' && minX>j) {
                    minX=j;
                }
            }
        }
        answer[1]=minX;
        
        // 맨 아래쪽 점 rdx
        int maxY=0;
        for(int i=0;i<wallpaper.length;i++) {
            if(wallpaper[i].contains("#") && maxY<i) {
                maxY=i;
            }
        }
        answer[2]=maxY+1;
        
        // 맨 뒤쪽 점 rdy
        int maxX=0;
        for(int i=0;i<wallpaper.length;i++) {
            for(int j=0;j<wallpaper[i].length();j++) {
                if(wallpaper[i].charAt(j)=='#' && maxX<j) {
                    maxX=j;
                }
            }
        }
        answer[3]=maxX+1;
        
        return answer;
    }
}