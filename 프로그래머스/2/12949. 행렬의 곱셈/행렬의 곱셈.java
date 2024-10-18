class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Row = arr1.length;
        int arr1Column = arr1[0].length;
        int arr2Row = arr2.length;
        int arr2Column = arr2[0].length;
        
        int[][] answer = new int[arr1Row][arr2Column];
        
//         arr1 0 0, arr2 0 0
//         arr1 0 1, arr2 1 0
//        
//         arr1 0 0, arr2 0 1
//         arr2 0 1, arr2 1 1
        
        for (int i = 0; i < arr1Row; i++) {
            for (int j = 0; j < arr2Column; j++) {
                for (int k = 0; k < arr1Column; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}