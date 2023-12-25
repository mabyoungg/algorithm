import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < names.length; i+=5){
            list.add(names[i]);
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
        
//         1안
//         String[] answer = names.length%5 == 0 ? new String[names.length/5] : new String[names.length/5 + 1];
//         int num = 0;
        
//         for (int i = 0; i < answer.length; i++){
//             answer[i] = names[num];
//             num+=5;
//         }

//         return answer;
        
    }
}