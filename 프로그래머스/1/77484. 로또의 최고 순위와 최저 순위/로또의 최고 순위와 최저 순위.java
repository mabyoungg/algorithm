import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> win = new HashSet<>();
        
        for (int winNum : win_nums) {
            win.add(winNum);
        }

        int zero = 0;
        int match = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            } else if (win.contains(lotto)) {
                match++;
            } 
        }

        return new int[]{7 - Math.max((match + zero), 1), 7 - Math.max(match, 1)};
        
//         1안
//         int[] answer = {};
//         int answer_count = 0;
//         int count_0 = 0;
        
//         //         맞는 개수 = 최저순위
//         //         맞는 개수 + 0 개수 = 최고순위 
        
//         for (int i = 0; i < lottos.length; i++) {
//             if (lottos[i] == 0) {
//                 count_0++;
//             }
            
//             for (int j = 0; j < win_nums.length; j++) {
//                 if (lottos[i] == win_nums[j]) {
//                     answer_count++;
//                 }
//             }
//         }
        
//         int maxRank = 7 - (count_0 + answer_count);
//         int minRank = 7 - answer_count;
        
//         if (maxRank > 6) {
//             maxRank = 6;
//         }
        
//         if (minRank > 6) {
//             minRank = 6;
//         }

//         return new int[] {maxRank, minRank};
    }
}