import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]){
            answer = 1111 * dice[0];
        } else if (dice[0] == dice[2]){
            answer = (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]);
        } else if (dice[1] == dice[3]){
            answer = (10 * dice[1] + dice[0]) * (10 * dice[1] + dice[0]);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]){
            answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        } else if (dice[0] == dice[1]){
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]){
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]){
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }
        return answer;
    }
}