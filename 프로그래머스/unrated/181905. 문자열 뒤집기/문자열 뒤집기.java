import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String reverse = "";
        String fistAnswer = my_string.substring(0, s);
        String lastAnswer = my_string.substring(e + 1);
        
        for (int i = e; i >= s; i--){
            reverse += my_string.charAt(i);
        }
        
        answer = fistAnswer + reverse + lastAnswer;
        
        return answer;
    }
}