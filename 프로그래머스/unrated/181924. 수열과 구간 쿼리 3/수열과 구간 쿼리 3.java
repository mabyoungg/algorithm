class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp, k, l;
        // 0 0 0 1   1 0 1 1  2 0 2 1
        for (int i = 0; i < queries.length; i++){
            
            k = queries[i][0];
            l = queries[i][1];
            temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            
        }
        
        answer = arr;
        
        return answer;
    }
}