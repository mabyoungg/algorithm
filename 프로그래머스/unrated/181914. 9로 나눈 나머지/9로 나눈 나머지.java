class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] arrNum = number.split("");
        
        for (String num : arrNum){
            sum += Integer.parseInt(num);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}