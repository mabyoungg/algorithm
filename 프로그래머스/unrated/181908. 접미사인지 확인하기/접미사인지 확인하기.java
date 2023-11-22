import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.substring(i);
        }
        
        if (Arrays.asList(arr).contains(is_suffix)){
            return answer = 1;
        }
        
        return answer;
    }
}