class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int split = 0;
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (pat.equals(myString.substring(i, i + pat.length()))) {
                split = i;
            }
        }
        
        answer = myString.substring(0, split + pat.length());

        return answer;
    }
}