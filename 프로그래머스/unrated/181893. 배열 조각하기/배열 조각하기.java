import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            List<Integer> list = new ArrayList<>();
            if(i % 2 == 0) {
                for(int j = 0; j <= query[i]; j++) {
                    list.add(arr[j]);
                }
                arr = list.stream().mapToInt(l -> l).toArray();
            } else {
                for(int k = query[i]; k < arr.length; k++) {
                    list.add(arr[k]);
                }
                arr = list.stream().mapToInt(l -> l).toArray();
            }  
        } 
        
        int[] answer = arr;

        return answer;
    }
}