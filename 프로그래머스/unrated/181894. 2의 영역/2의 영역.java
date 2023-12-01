import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List <Integer> list = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2){
                list.add(i);
            }
        }
        
        if (list.size() == 0){
            list2.add(-1);
        } else if (list.size() == 1){
            list2.add(2);
        } else {
            for(int j = list.get(0); j <= list.get(list.size()-1); j++) {
                list2.add(arr[j]);
            }
        }
        
        int[] answer = new int[list2.size()];
        answer = list2.stream().mapToInt(k -> k).toArray();
        return answer;
    }
}