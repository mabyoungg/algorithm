import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr2[i] >= 50 && arr2[i] % 2 == 0) {
                    arr2[i] /= 2;
                } else if (arr2[i] < 50 && arr2[i] % 2 != 0) {
                    arr2[i] = arr2[i] * 2 + 1;
                }
            }
            
            if (Arrays.equals(arr, arr2)) {
                break;
            } else {
                arr = Arrays.copyOf(arr2, arr2.length);
                answer++;
            }
            
        }
        
        return answer;
    }
}