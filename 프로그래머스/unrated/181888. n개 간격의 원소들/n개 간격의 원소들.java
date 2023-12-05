class Solution {
    public int[] solution(int[] num_list, int n) {
        int answerLength = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[answerLength];
        int numListIndex = 0;
          
        for(int i = 0; i < answerLength; i++) {
            answer[i] = num_list[numListIndex];
            numListIndex += n;
        }
        
        return answer;
    }
}