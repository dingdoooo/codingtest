import java.util.Locale;

class Solution {
    public static boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;

        s = s.toLowerCase(Locale.ROOT);
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='p'){
                p++;
            }else if(s.charAt(i)=='y'){
                y++;
            }
        }

        if(p==y){
            answer = true;
        }

        return answer;
    }

}
