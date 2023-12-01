import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List <Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2){
                list.add(i);
            }
        }
        
        if (list.size() == 0){
            return new int[]{-1};
        }
        
        int startIndex = list.get(0);
        int endIndex = list.get(list.size()-1);
        
        answer = Arrays.copyOfRange(arr, startIndex, endIndex+1);
        
        return answer;
        
        
//         1안
//         List <Integer> list = new ArrayList<>();
//         List <Integer> list2 = new ArrayList<>();
        
//         for (int i = 0; i < arr.length; i++){
//             if (arr[i] == 2){
//                 list.add(i);
//             }
//         }
        
//         if (list.size() == 0){
//             list2.add(-1);
//         } else if (list.size() == 1){
//             list2.add(2);
//         } else {
//             for(int j = list.get(0); j <= list.get(list.size()-1); j++) {
//                 list2.add(arr[j]);
//             }
//         }
        
//         int[] answer = new int[list2.size()];
//         answer = list2.stream().mapToInt(k -> k).toArray();
//         return answer;
    }
}