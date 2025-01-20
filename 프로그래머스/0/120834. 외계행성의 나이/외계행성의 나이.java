class Solution {
    public String solution(int age) {
        String answer = "";
        String Eage = "abcdefghij";
        String[] arrAge = String.valueOf(age).split("");
        
        for(int i=0; i<arrAge.length; i++) {
            answer += Eage.charAt(Integer.valueOf(arrAge[i]));
        }
        
        return answer;
    }
}