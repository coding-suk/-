class Solution {
    public int solution(int[] dot) {
        int i = 0;
        int answer = 0;
        
        if(dot[i] > 0) {
            if(dot[i+1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if(dot[i+1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        
        return answer;
    }
}