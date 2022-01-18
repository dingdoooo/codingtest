import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long savenum = x;
		ArrayList list = new ArrayList();
		
		if( n > 0) {
			for (int i = 0; i < n; i++) {
				list.add(savenum);
				savenum += x;
			}
		}
		
		long[] answer = new long[list.size()];
		for(int i = 0 ; i < list.size();i++) {
			answer[i] = (long) list.get(i);
		}

		return answer;
	}
}
