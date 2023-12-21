import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        return Arrays.stream(arr1)
                .map(row ->
                        IntStream.range(0, arr2[0].length)
                                .mapToObj(col ->
                                        IntStream.range(0, arr2.length)
                                                .map(k -> row[k] * arr2[k][col])
                                                .sum()
                                )
                                .mapToInt(Integer::intValue)
                                .toArray()
                )
                .toArray(int[][]::new);
    }
}
