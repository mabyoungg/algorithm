import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        int[] counts = new int[10];
        
        while (n > 0) {
            counts[(int)(n % 10)]++;
            n /= 10;
        }
        
        long answer = 0;
        
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < counts[i]; j++) {
                answer += i;
                answer *= 10;
            }
        }
        
        return answer / 10;
        
//         2안
//         String[] digits = String.valueOf(n).split("");

//         Arrays.sort(digits, Collections.reverseOrder());

//         StringBuilder sb = new StringBuilder();
        
//         for (String digit : digits) {
//             sb.append(digit);
//         }
            
//         return Long.parseLong(sb.toString());
        
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