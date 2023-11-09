class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        // queries 0 0 0 1 -> 값들의 arr 범위 -> queries 0 2 보다 크면서 가장 작은수
        
        for(int i = 0; i < queries.length; i++) {
            int min = 1000000;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2] && min > arr[j]) {
                    min = arr[j];
                }
            }
            
            if(min == 1000000) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
            
        }

        return answer;
    }
}