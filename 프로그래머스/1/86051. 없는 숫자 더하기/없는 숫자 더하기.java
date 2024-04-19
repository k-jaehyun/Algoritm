class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0;i<numbers.length;i++) {
            a[numbers[i]] = 0;
        }
        
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
            
            answer+=a[i];
        }
        
        return answer;
    }
}