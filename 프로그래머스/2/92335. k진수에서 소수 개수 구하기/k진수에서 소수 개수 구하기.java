class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] p = Integer.toString(n, k).split("0");
        
        for (String s : p) {
            if (!s.isEmpty() && isPrimeNumber(Long.parseLong(s))) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private static boolean isPrimeNumber(long num) {
        if (num == 1) {
            return false;
        }
        
        boolean isPrime = true;
        int sqrt = (int)Math.sqrt(num + 1);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}