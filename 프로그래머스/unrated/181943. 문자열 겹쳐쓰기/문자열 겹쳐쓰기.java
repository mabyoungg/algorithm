class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String startWord;
        String middleWord;
        String endWord;
        
        startWord = my_string.substring(0, s);
        middleWord = overwrite_string;
        endWord = my_string.substring(s + middleWord.length());    
            
        answer = startWord + middleWord+ endWord;
        
        return answer;
    }
}