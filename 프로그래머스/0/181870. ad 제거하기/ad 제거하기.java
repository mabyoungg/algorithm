import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
      
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        int strListSize = strList.size();
        int n = 0;
        
        for (int i = 0; i < strListSize; i++) {         
            if (strList.get(i - n).contains("ad")) {
                strList.remove(i - n);
                n += 1;
            }
        }
        
        String[] answer = strList.toArray(new String[strList.size()]);
        
        return answer;
    }
}