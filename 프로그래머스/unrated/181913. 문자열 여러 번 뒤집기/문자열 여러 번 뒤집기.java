class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++){
            String reverseString = sb.substring(queries[i][0], queries[i][1] + 1);
            StringBuilder sb2 = new StringBuilder(reverseString);
            sb2.reverse();
            sb.replace(queries[i][0], queries[i][1] + 1, sb2.toString());
        }
        
        answer = sb.toString();
        
        return answer;
    }
}