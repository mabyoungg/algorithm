class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String abString = Integer.toString(a) + Integer.toString(b);
        int abInt = Integer.parseInt(abString);
        int compareNum = 2 * a * b;
        
        if (abInt >= compareNum){
            answer = abInt;
        } else {
            answer = compareNum;
        }
        
        return answer;
    }
}