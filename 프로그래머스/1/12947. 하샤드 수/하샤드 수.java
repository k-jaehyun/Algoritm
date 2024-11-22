class Solution {
    public boolean solution(int x) {
        return x % String.valueOf(x).chars().map(ch -> ch - '0').sum() == 0;
    }
}