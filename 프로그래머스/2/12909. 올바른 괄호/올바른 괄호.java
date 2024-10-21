import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        char[] inputCharArray = s.toCharArray();
        for (char c : inputCharArray) {
            if (c == '(') {
                stack.push(c);
            } else if(c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
    
        return stack.isEmpty();
        
        
//         ArrayDeque<Character> stack = new ArrayDeque<>();
        
//         char[] inputCharArray = s.toCharArray();
//         for (char c : inputCharArray) {
//             if (c == '(') {
//                 stack.push(c);
//             } else if(stack.isEmpty() || stack.pop() == c) {
//                 return false;
//             }
//         }
    
//         return stack.isEmpty();
    }
}