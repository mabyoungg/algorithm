import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n == 1) {
            for(int i = 0; i < b + 1; i++) {
                list.add(num_list[i]);
            }
        } else if(n == 2) {
            for(int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if(n == 3) {
            for(int i = a; i < b + 1; i++) {
                list.add(num_list[i]);
            }
        } else if(n == 4) {
            for(int i = a; i < b + 1; i+=c) {
                list.add(num_list[i]);
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
        
        
        // 1안
//         int[] answer = {};
//         int a = slicer[0];
//         int b = slicer[1];
//         int c = slicer[2];
//         int temp = a;
            
//         if(n == 1) {
//             answer = new int[b +1 ];
//             for(int i = 0; i < answer.length; i++) {
//                 answer[i] = num_list[i];
//             }
//         } else if(n == 2) {
//             answer = new int[num_list.length - a];
//             for(int i = 0; i < answer.length; i++) {
//                 answer[i] = num_list[a];
//                 a++;
//             }
//         } else if(n == 3) {
//             answer = new int[b - a + 1];
//             for(int i = 0; i < answer.length; i++) {
//                 answer[i] = num_list[a];
//                 a++;
//             }
//         } else if(n == 4) {
//             answer = new int[(b - a) / c + 1];
//             for(int i = 0; i < answer.length; i++) {
//                 answer[i] = num_list[temp];
//                 temp+=c;
//             }
//         } 
        
//         return answer;
    }
}