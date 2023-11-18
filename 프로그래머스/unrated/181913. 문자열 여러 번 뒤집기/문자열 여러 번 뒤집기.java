import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] stringArr = my_string.split("");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int endNum = queries[i][1];
            String temp = "";
            
            for(int j = start; j <= (start+end)/2; j++) {
                temp = stringArr[endNum];
                stringArr[endNum] = stringArr[j];
                stringArr[j] = temp;
                endNum--; 
            }
        
        }
        
        for(int k = 0; k < stringArr.length; k++) {
            sb.append(stringArr[k]);
        }
        
        answer = sb.toString();

        return answer;
    }
}