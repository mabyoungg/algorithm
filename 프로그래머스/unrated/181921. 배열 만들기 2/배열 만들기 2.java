import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        // l ~ r  l in 5, 0
        for(int i = l; i <= r; i++) {
            int count = 0;
             String intToString = Integer.toString(i);
            for(int j = 0; j < intToString.length(); j++) {
                if(!(intToString.charAt(j) == '5' || intToString.charAt(j) == '0')) {
                    count++;
                } 
            }
            if(count == 0) {
                list.add(i);
            }
        }
        
        
        int[] answer = new int[list.size()];
        answer = list.stream().mapToInt(i -> i).toArray();
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}