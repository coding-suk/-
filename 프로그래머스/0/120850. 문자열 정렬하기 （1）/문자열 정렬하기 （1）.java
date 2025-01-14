import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[my_string.length()];
        String[] string = my_string.split("");
                
        for(int i=0; i<my_string.length(); i++) {
            answer[i] = Integer.parseInt(string[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}