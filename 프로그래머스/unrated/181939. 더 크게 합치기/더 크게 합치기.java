class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String abString = Integer.toString(a) + Integer.toString(b);
        String baString = Integer.toString(b) + Integer.toString(a);
        
        int abInt = Integer.parseInt(abString);
        int baInt = Integer.parseInt(baString);
        
        if(abInt >= baInt) {
            answer = abInt;
        } else {
            answer = baInt;
        }
        
        return answer;
    }
}