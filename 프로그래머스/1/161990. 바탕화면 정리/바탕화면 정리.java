class Solution {
    public int[] solution(String[] wallpaper) {
        int lux=0;
        int luy=-1;
        int rdx=0;
        int rdy=0;

        int minluy=0;
        int maxrdy;

        for (int i=0;i<wallpaper.length;i++) {
            if (wallpaper[i].contains("#")) {
                lux=i;
                break;
            }
        }

        for (int i=0;i<wallpaper.length;i++) {
            if (wallpaper[i].contains("#")) {
                if (luy==-1) {
                    minluy = wallpaper[i].indexOf("#");
                    luy = wallpaper[i].indexOf("#");
                } else {
                    luy=wallpaper[i].indexOf("#");
                    if (minluy>luy) minluy=luy;
                }
            }
        }

        for (int i=0;i<wallpaper.length;i++) {
            if (wallpaper[i].contains("#")) {
                rdx=i+1;
            }
        }

        for (int i=0;i<wallpaper.length;i++) {
            if (wallpaper[i].contains("#")) {
                maxrdy=wallpaper[i].lastIndexOf("#");
                if (maxrdy>rdy) rdy=maxrdy;
            }
        }

        int[] answer = {lux,minluy,rdx,rdy+1};

        return answer;
    }
}