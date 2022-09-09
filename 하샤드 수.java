class Solution {
    public boolean solution(int x) {
        // x%10과 x/=10을 이용해서 한 자리씩 더한다
        // 더한 값으로 나눠서 0이 나오면 트루 아니면 펄스
        
        
        boolean answer = true;
        int a = x;
        int i = 0;
        while (true){
            i += (a % 10);
            a /= 10;
            if ( a == 0){
                break;
            }
        }
        if(x % i == 0)
            answer = true;
        else
            answer = false;        
        return answer;
    }
}