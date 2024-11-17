import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        return Math.min((int) Arrays.stream(nums).distinct().count(), nums.length /2);
            
//         1안
//         HashSet<Integer> set = Arrays.stream(nums)
//             .boxed()
//             .collect(Collectors.toCollection(HashSet::new));
        
//         int n = nums.length;
//         int k = n / 2;
        
//         return Math.min(k, set.size());
    }
}