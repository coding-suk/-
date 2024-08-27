class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int w = Math.min(sizes[i][0], sizes[i][1]);
            maxW = Math.max(maxW, v);
            maxH = Math.max(maxH, w);
        }
        answer = maxW * maxH;
        return answer;
    }
}