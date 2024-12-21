import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> answerSort = new ArrayList<String>();
        
        for (int i = 0; i < strings.length; i++) {
            answerSort.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(answerSort);
        
        String[] answer = new String[answerSort.size()];
        
        for (int j = 0; j < answerSort.size(); j++) {
           answer[j] = answerSort.get(j).substring(1);
        }

        return answer;
    }
}