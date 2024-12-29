import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] digits = String.valueOf(n).split("");

        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        
        for (String digit : digits) {
            sb.append(digit);
        }
            
        return Long.parseLong(sb.toString());
        
//         1안
//         long answer = 0;
//         String nString = String.valueOf(n);
//         String nStringSort = "";
//         String[] nArray = new String[nString.length()];
        
//         for(int i = 0; i < nString.length(); i++) {
//             nArray[i] = Character.toString(nString.charAt(i));
//         }
        
//         Arrays.sort(nArray, Collections.reverseOrder());
  
//         for (int j = 0; j<nArray.length; j++) {
//             nStringSort += nArray[j];       
//         }
        
//         return answer = Long.parseLong(nStringSort);
    }
}