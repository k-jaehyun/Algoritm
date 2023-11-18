class Solution {
    public String solution(int[] food) {
                String answer = "0";

        for(int i= food.length-1;i>0;i--) {
            for (int j=0;j<food[i]/2;j++) {
                answer = i+answer+i;
            }
        }

        return answer;
//         String answer = "";

//         int arrLen = 1;

//         for(int i=1; i<food.length;i++) {
//             if(food[i]%2==1) {
//                 food[i]=food[i]-1;
//                 arrLen+=food[i];
//             } else {
//                 arrLen+=food[i];
//             }
//         }

//         int[] intArr = new int[arrLen];

//         int a = 0;

//         for(int i=0;i<food.length-1;i++) {
//             for(int j=0;j<food[i+1]/2;j++) {
//                 intArr[i+j+a]=i+1;
//                 intArr[arrLen-1-i-j-a]=i+1;
//             }
//             a+=food[i+1]/2-1;
//         }

//         for(int i=0;i< intArr.length;i++) {
//             answer+=String.valueOf(intArr[i]);
//         }

//         return answer; 
    }
}