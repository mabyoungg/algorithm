class Solution {
    public int solution(int[][] board, int[][] skill) {
         int[][] sum = new int[board.length + 1][board[0].length + 1];

        for (int[] s : skill) {
            int degree = s[5] * (s[0] == 1 ? -1 : 1);
            sum[s[1]][s[2]] += degree;
            sum[s[3] + 1][s[4] + 1] += degree;
            sum[s[1]][s[4] + 1] -= degree;
            sum[s[3] + 1][s[2]] -= degree;
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 1; j < sum[0].length; j++) {
                sum[i][j] += sum[i][j - 1];
            }
        }

        for (int i = 1; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] += sum[i - 1][j];
            }
        }

        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] + sum[i][j] > 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}