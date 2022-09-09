class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        long j = 0;
        
        if(a>b){
            for(;b<=a;){
                j += b;
                b++;
            }
        }else if(b>a){
            for(;a<=b;){
                j += a;
                a++;
            }
        }else{
            j = a;
        }
        answer=j;
        return answer;
    }
}