class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int temp = a;
            
        if(n == 1) {
            answer = new int[b +1 ];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = num_list[i];
            }
        } else if(n == 2) {
            answer = new int[num_list.length - a];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = num_list[a];
                a++;
            }
        } else if(n == 3) {
            answer = new int[b - a + 1];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = num_list[a];
                a++;
            }
        } else if(n == 4) {
            answer = new int[(b - a) / c + 1];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = num_list[temp];
                temp+=c;
            }
        } 
        
        return answer;
    }
}