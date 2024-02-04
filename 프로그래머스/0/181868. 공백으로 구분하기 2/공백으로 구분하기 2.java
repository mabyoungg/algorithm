import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] myStringArray = my_string.split(" ");
        List<String> myStringList = new ArrayList<>();
        
        for (int i = 0; i < myStringArray.length; i++) {
            if (!myStringArray[i].equals("")) {
                myStringList.add(myStringArray[i]);
            }
        }
        
        String[] answer = myStringList.toArray(new String[myStringList.size()]);
        
        return answer;
    }
}