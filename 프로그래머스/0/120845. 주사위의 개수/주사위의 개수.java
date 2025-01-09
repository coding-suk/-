class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i=0; i<box.length; i++) {
            int div = box[i] / n;
            answer *= div;
        }
        
        return answer;
    }
}