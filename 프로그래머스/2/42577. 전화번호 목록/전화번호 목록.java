import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                if (set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
        
//         1안
//         Arrays.sort(phone_book);

//         for (int i = 0; i < phone_book.length - 1; i++) {
//             if (phone_book[i + 1].startsWith(phone_book[i])) {
//                 return false;
//             }
//         }

//         return true;
    }
}