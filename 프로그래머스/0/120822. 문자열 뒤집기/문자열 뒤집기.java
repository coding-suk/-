import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arrStr = my_string.split("");
        String[] arr = new String[arrStr.length];
        
        for(int i = arrStr.length; i>0; i--) {
            arr[arrStr.length-i] = arrStr[i-1];
        }
        answer = String.join("",arr);
        
        return answer;
    }
}