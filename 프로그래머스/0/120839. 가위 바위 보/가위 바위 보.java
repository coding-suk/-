import java.util.*;
class Solution {
    public String solution(String rsp) {
        String[] rsp1=rsp.split("");
        String[] answer1 = new String[rsp1.length];
        
        for(int i=0; i<rsp1.length; i++) {
            if(rsp1[i].equals("2")) {
                answer1[i] = "0";
            }
            if(rsp1[i].equals("0")) {
                answer1[i] = "5";
            }
            if(rsp1[i].equals("5")) {
                answer1[i] = "2";
            }
        }
        String answer = String.join("", answer1);
        return answer;
    }
}