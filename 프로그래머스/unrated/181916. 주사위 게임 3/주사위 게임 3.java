class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if (a == b && a == c && a == d){
            answer = 1111 * a;
        } else if (a == b && a == c && a != d){
            answer = (10 * a + d) * (10 * a + d);
        } else if (a == b && a != c && a == d){
            answer = (10 * a + c) * (10 * a + c);
        } else if (a != b && a == c && a == d){
            answer = (10 * a + b) * (10 * a + b);
        }  else if (a != b && b == c && b == d){
            answer = (10 * b + a) * (10 * b + a);
        } else if (a == b && c == d && a != c){
            answer = (a + c) * Math.abs(a - c);
        } else if (a == c && b == d && a != b){
            answer = (a + b) * Math.abs(a - b);
        } else if (a == d && b == c && a != b){
            answer = (a + b) * Math.abs(a - b);
        } else if (a == b && c != d && a != c && a != d){
            answer = c * d;
        } else if (a == c && b != d && a != b && a != d){
            answer = b * d;
        } else if (a == d && b != c && a != b && a != c){
            answer = b * c;
        } else if (b == c && a != d && b != a && b != d){
            answer = a * d;
        } else if (b == d && a != c && b != a && b != c){
            answer = a * c;
        } else if (c == d && a != b && c != a && c != b){
            answer = a * b;
        } else {
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }
        
        return answer;
    }
}