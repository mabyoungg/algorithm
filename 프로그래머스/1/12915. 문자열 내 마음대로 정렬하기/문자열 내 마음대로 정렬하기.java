import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> o1.charAt(n) == o2.charAt(n) ? o1.compareTo(o2) : Character.compare(o1.charAt(n), o2.charAt(n)));
        
        return strings;
        
//         1안
//         ArrayList<String> answerSort = new ArrayList<String>();
        
//         for (int i = 0; i < strings.length; i++) {
//             answerSort.add(strings[i].charAt(n) + strings[i]);
//         }
        
//         Collections.sort(answerSort);
        
//         String[] answer = new String[answerSort.size()];
        
//         for (int j = 0; j < answerSort.size(); j++) {
//            answer[j] = answerSort.get(j).substring(1);
//         }

//         return answer;
    }
}