class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        // 문자열 변환
        int tmp = storey;
        
        while(true) {
		String str = String.valueOf(tmp);
		int idx = (int) str.charAt(str.length()-1) - '0';
            
                if(str.length() >= 2){
                    int beforeNum = (int) str.charAt(str.length()-2) - '0';

                    if(beforeNum < 5) {
                        if(idx <= 5){
                            tmp -= idx;
                            answer += idx;
                        } else {
                            tmp += 10 - idx;
                            answer += 10-idx;
                        }
                    } else {
                        if(idx >= 5) {
                            tmp += 10 - idx;
                            answer += 10-idx;
                        } else {
                            tmp -= idx;
                            answer += idx;
                        }
                    }
                } else {
                    if(idx > 5) {
                    tmp += 10 - idx;
                    answer += 10 - idx;
                    } else {
                        tmp -= idx;
                        answer += idx;
                    }
                }

                if(tmp == 0) {
                    break;
                }

                str = String.valueOf(tmp);

                int cnt = 0;
                for(int i = str.length()-1; i >= 0; i--) {
                    if(str.charAt(i) != '0') {
                        break;
                    } else {
                        cnt++;
                    }
                }
                str = str.substring(0, str.length()-cnt);

                tmp = Integer.parseInt(str);
        }

        return answer;
	}
}