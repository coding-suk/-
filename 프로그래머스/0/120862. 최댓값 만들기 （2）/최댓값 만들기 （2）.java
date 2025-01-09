import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int max = numbers[i] * numbers[j];
                  if(answer < max) {
                      answer = max;
                  }
            }
        }
        return answer;
    }
}