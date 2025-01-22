class Solution {
    public int solution(int[] money) {
        int n = money.length;
        int[] firstVisit = new int[n];
        int[] firstNotVisit = new int[n];

        firstVisit[0] = money[0];
        firstVisit[1] = money[0];
        for (int i = 2; i < n - 1; i++) {
            firstVisit[i] = Math.max(firstVisit[i - 1], firstVisit[i - 2] + money[i]);
        }

        firstNotVisit[1] = money[1];
        for (int i = 2; i < n; i++) {
            firstNotVisit[i] = Math.max(firstNotVisit[i - 1], firstNotVisit[i - 2] + money[i]);
        }

        return Math.max(firstVisit[n - 2], firstNotVisit[n - 1]);
    }
}