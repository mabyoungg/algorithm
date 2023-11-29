import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
   
        for (int i = 0; i < my_string.length(); i++){
            int count = 0;
            for (int j = 0; j < indices.length; j++){
                if (indices[j] == i){
                    count++;
                }
            }
            if (count == 0){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}