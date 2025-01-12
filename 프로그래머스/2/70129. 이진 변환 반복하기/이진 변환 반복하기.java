public class Solution {
    public int[] solution(String s) {
        int countBinary = 0;
        int countZero = 0;

        while (!s.equals("1")) {
            countBinary++;
            
            int numZero = s.replace("1", "").length();
            
            countZero += numZero;
            
            s = Integer.toBinaryString(s.length() - numZero);
        }

        return new int[]{countBinary, countZero};
    }
}