import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int solution(int[] topping) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr1 = new int[topping.length];
        int[] arr2 = new int[topping.length];
        
        for (int i = 0; i < topping.length; i++) {
            set.add(topping[i]);
            arr1[i] = set.size();
        }
        
        set.clear();
        
        for (int i = topping.length - 1; i >= 0; i--) {
            set.add(topping[i]);
            arr2[i] = set.size();
        }
        
        int answer = 0;
        
        for (int i = 0; i < topping.length - 1; i++) {
            if (arr1[i] == arr2[i + 1]) {
                answer++;
            }
        }
        
        return answer;
        
//         1안
//         int answer = 0;
//         HashMap<Integer, Integer> toppingMap = new HashMap<>();
        
//         for (int t : topping) {
//             toppingMap.put(t, toppingMap.getOrDefault(t, 0) + 1);
//         }

//         HashSet<Integer> toppingSet = new HashSet<>();

//         for (int t : topping) {
//             toppingSet.add(t);
//             toppingMap.put(t, toppingMap.get(t) - 1);

//             if (toppingMap.get(t) == 0) {
//                 toppingMap.remove(t);
//             }
                
//             if (toppingSet.size() == toppingMap.size()) {
//                 answer++;
//             }
//         }
        
//         return answer;
    }
}