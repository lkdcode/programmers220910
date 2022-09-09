class Solution {
    boolean solution(String s) {
    // 문자열의 길이를 확인하고 위치에 따라 int p+1 y+1
    // y와 p의 갯수를 비교하고 같으면 yes 아니면 false
        
        boolean answer = true;
        int a = s.length();
        char ch;
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < a ; i++){
            ch = s.charAt(i);
            if( ch == 'y' || ch =='Y'){
                y++;
            }
            else if ( ch == 'p' || ch == 'P'){
                p++;
            }
        }
        if ( p == y ){
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}