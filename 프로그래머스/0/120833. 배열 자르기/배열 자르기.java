class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        
        for(int i=0; i<numbers.length; i++) {
            if(i >= num1) {
                if(i <= num2) {
                    answer[i-num1] = numbers[i];
                }
            }
        }
        
        return answer;
    }
}