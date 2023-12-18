class Solution {
    public int solution(int[] arr) {
        int leatCommonMultiple = arr[0];
        // 2개씩 최대공약수 구한다음 최소공배수 구하기
        if(arr.length>1) {
            for (int i = 0; i < arr.length - 1; i++) {
                leatCommonMultiple = doLeastCommonMultiple(leatCommonMultiple, arr[i + 1]);
            }
        }
        return leatCommonMultiple;
    }

    // 최대 공약수 구하기
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    // 최소 공배수 구하기
    public int doLeastCommonMultiple(int a, int b) {
        return a*b/gcd(a,b);
    }
}