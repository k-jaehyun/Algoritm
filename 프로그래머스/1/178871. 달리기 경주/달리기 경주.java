import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 플레이어 랭킹을 맵으로 만듦
        Map<String, Integer> playerRankingMap = new HashMap<>();
        for (int i=0;i< players.length;i++) {
            playerRankingMap.put(players[i], i+1);
        }

        // 이름 부르면 랭킹을 바꿈
        for (String calling : callings) {
            int calledPlayerRanking = playerRankingMap.get(calling);
            String frontPlayer = players[calledPlayerRanking-2];

            // map의 랭킹을 바꿈
            playerRankingMap.replace(frontPlayer,calledPlayerRanking);
            playerRankingMap.replace(calling,calledPlayerRanking-1);

            // players 배열의 순서를 바꿈
            players[calledPlayerRanking-2]=players[calledPlayerRanking-1];
            players[calledPlayerRanking-1]=frontPlayer;
        }

        return players;
    }
}