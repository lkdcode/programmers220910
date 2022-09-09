class Solution {
    public int[] solution(long n) {
        // 자연수 n을 문자열로 변경
        // 문자열의 길이 확인
        // 길이만큼 배열 공간 선언
        // 반복문으로 자연수 일의 자리씩 떼어서 배열에 넣기        
        
       String str1 = Long.toString(n);
       int a = str1.length();
      
       int[] answer = new int[a];
        
        for(int i = 0; i < a ; i++){
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}