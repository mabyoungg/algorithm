class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i < myString.length(); i ++) {
            if (myString.substring(i).startsWith(pat)) {
                answer += 1;
            }
        }
        
        return answer;
        
//         1안
//         int answer = 0;
//         int myStringLength = myString.length();
        
//         for (int i = 0; i <= myStringLength; i++) {
//             for (int j = i; j <= myStringLength; j++) {
//                 String myStringSubstring =  myString.substring(i, j);
//                 if (myStringSubstring.equals(pat)) {
//                     answer += 1;
//                 }    
//             }
//         }

//         return answer;
    }
}