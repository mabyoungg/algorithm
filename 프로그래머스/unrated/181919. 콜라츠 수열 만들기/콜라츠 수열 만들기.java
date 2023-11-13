import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(); 

        while(true) {
            list.add(n);
                
            if(n % 2 == 0) {
                n /= 2;
            } else if(n == 1){
                break;
            } else {
                n = 3 * n + 1;
            }
        }

        int[] answer = new int[list.size()];
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}