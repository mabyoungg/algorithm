class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for (int n : numbers) {
            answer -= n;
        }
            
        return answer;
        
//         1안
//         int answer = 0;
//         int num = 0;
        
//         for (int i = 0; i < numbers.length; i++) {
//             num += numbers[i];
//         }
        
//         answer = 45 - num;

//         return answer;
    }
}