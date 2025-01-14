class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        int[] number = new int[num.length()];
        
        for(int i=0; i<num.length(); i++) {
            number[i] = num.charAt(i) - '0';
        }
        for(int j=0; j<number.length; j++) {
            answer += number[j];
        }
        
        return answer;
    }
}