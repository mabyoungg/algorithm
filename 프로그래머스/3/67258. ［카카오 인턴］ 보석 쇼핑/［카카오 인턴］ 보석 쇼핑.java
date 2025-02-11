import java.util.HashMap;
import java.util.Optional;

class Solution {
    public int[] solution(String[] gems) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String gem : gems) {
            map.put(gem, 0);
        }

        int l = 0;
        int r = 0;
        int min = gems.length + 1;
        int al = 1;
        int ar = gems.length;
        int max = map.size();
        map = new HashMap<>();

        while (r < gems.length) {
            int cnt = Optional.ofNullable(map.get(gems[r])).orElse(0) + 1;
            
            map.put(gems[r++], cnt);

            while (map.size() == max) {
                if (min > r - l) {
                    min = r - l;
                    al = l + 1;
                    ar = r;
                }
                
                cnt = map.get(gems[l]) - 1;
                
                if (cnt == 0) {
                    map.remove(gems[l]);
                } else {
                    map.put(gems[l], cnt);
                }
                
                l++;
            }
        }
        
        return new int[]{al, ar};
    }
}