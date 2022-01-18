import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqr = (long)Math.sqrt(n);
        
        if(n>=1) {
          //n%sqr ==0 이거때문에 계속 오류났었는데 이유를 모르겄ㄸ ㅏㅠㅠ
        	if(n/sqr == sqr && n%sqr ==0) {
        		answer = (long)Math.pow(sqr+1,2);
        	}else{
        		answer = -1;
        	}
        }else {
        	answer = -1;
        }
        return answer;
    }       
}
