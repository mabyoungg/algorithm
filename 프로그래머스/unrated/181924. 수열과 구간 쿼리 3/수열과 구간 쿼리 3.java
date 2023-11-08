class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp, k, l;
        // 0 0 0 1   1 0 1 1  2 0 2 1
        for (int i = 0; i < queries.length; i++){
            for (int j = 0; j < queries[i].length - 1; j++){
                k = queries[i][j];
                l = queries[i][j+1];
                temp = arr[k];
                arr[k] = arr[l];
                arr[l] = temp;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}