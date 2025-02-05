import java.util.HashSet;
import java.util.regex.Pattern;

class Solution {
    private static String[] userId;
    private static Pattern[] regex;
    private static boolean[] used;
    private static HashSet<String> answer;
    
    public int solution(String[] user_id, String[] banned_id) {
        answer = new HashSet<>();
        userId = user_id;
        used = new boolean[banned_id.length];
        regex = new Pattern[banned_id.length];

        for (int i = 0; i < banned_id.length; i++) {
            regex[i] = Pattern.compile(banned_id[i].replace("*", "[a-z0-9]"));
        }

        backtrack(0, "");

        return answer.size();
    }

    private static void backtrack(int idx, String users) {
        if (users.length() == regex.length) {
            answer.add(users);
        }

        for (int i = idx; i < userId.length; i++) {
            String id = userId[i];
            for (int j = 0; j < regex.length; j++) {
                if (!used[j] && regex[j].matcher(id).matches()) {
                    used[j] = true;
                    backtrack(i + 1, users + i);
                    used[j] = false;
                }
            }
        }
    }
}