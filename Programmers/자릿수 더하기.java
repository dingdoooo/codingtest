import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        while(n > 0) {
        	arrNum.add(n%10);
        	n /= 10;
        }
        
        for(int i = 0; i < arrNum.size(); i++) {
        	answer += arrNum.get(i);
        }
        return answer;
    }
}
