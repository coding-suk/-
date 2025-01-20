class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] clap = String.valueOf(order).split("");
        for(int i=0; i<clap.length; i++) {
            int num = Integer.parseInt(clap[i]);
            if(num % 3 == 0 && num != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}