import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    
        
//         1안
//         int[] answer = {};
//         int[] person_1 = {1,2,3,4,5};
//         int[] person_2 = {2,1,2,3,2,4,2,5};
//         int[] person_3 = {3,3,1,1,2,2,4,4,5,5};
//         int a_cnt1 = 0;     
//         int a_cnt2 = 0;
//         int a_cnt3 = 0;
// //         answers 인덱스는 계속 늘어나지만 person 인덱스는 반복 01234 01234 01234
//         for (int i = 0; i < answers.length; i++) {
//             if(answers[i] == person_1[i%person_1.length]){
//                 a_cnt1++;
//             } 
//             if(answers[i] == person_2[i%person_2.length]){
//                 a_cnt2++;
//             } 
//             if(answers[i] == person_3[i%person_3.length]){
//                 a_cnt3++;
//             }  
//         }

//         int MaxScore = Math.max(a_cnt1,Math.max(a_cnt2,a_cnt3));
        
//         if (a_cnt1 == MaxScore && a_cnt2 == MaxScore && a_cnt3 == MaxScore) {
//             answer = new int[] {1,2,3};
//         }
//         else if (a_cnt1 == MaxScore && a_cnt2 == MaxScore){
//             answer = new int[] {1,2};
//         }
//         else if (a_cnt1 == MaxScore && a_cnt3 == MaxScore){
//             answer = new int[] {1,3};
//         }
//         else if (a_cnt2 == MaxScore && a_cnt3 == MaxScore){
//             answer = new int[] {2,3};
//         }
//         else if (a_cnt1 == MaxScore){
//             answer = new int[] {1};
//         }
//         else if (a_cnt2 == MaxScore){
//             answer = new int[] {2};
//         } else {
//             answer = new int[] {3};
//         }
    
        
//         return answer;
    }
}