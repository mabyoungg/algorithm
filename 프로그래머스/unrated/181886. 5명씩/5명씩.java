class Solution {
    public String[] solution(String[] names) {
        String[] answer = names.length%5 == 0 ? new String[names.length/5] : new String[names.length/5 + 1];
        int num = 0;
        
        for (int i = 0; i < answer.length; i++){
            answer[i] = names[num];
            num+=5;
        }

        return answer;
    }
}