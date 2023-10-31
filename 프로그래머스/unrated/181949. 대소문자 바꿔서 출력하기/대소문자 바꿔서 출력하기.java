import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (int i = 0; i < a.length(); i++){
            char inputChar = a.charAt(i);
            
            if (Character.isLowerCase(inputChar)){
                answer += Character.toUpperCase(inputChar);
            } else {
                answer += Character.toLowerCase(inputChar);
            } 
        }
        
        System.out.print(answer);
    }
}