import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(); 
        
        while(true) {
            if(n % 2 == 0) {
                list.add(n);
                n /= 2;
            } else{
                list.add(n);
                n = 3 * n + 1;  
            } 
            
            if(n == 1) {
                list.add(n);
                break;
            }
        }
        
        int[] answer = new int[list.size()];
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}