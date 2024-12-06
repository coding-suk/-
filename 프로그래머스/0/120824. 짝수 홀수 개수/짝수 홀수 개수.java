class Solution {
    public int[] solution(int[] num_list) {
        int hol = 0;
        int jjac = 0;
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                jjac++;
            } else {
                hol++;
            }
        }
        System.out.println(hol);
        System.out.println(jjac);
        
        int[]answer = new int[]{jjac, hol};
        
        return answer;
    }
}