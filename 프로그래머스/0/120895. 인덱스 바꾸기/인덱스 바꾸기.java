import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] string = my_string.split("");
        String temp; 
        
        temp = string[num1];
        string[num1] = string[num2];
        string[num2] = temp;
        answer = String.join("",string);
        
        return answer;
    }
}