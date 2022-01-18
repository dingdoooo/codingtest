import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		for(int i = 1; i <= n ; i++) {
			if(n%i == 0) {
				al1.add(i);
			}
		}
		
		for(int i = 1; i <= m ; i++) {
			if(m%i == 0) {
				al2.add(i);
			}
		}
		
		int max = 0;
		for(int i= 0; i < al1.size(); i++) {
			for(int j = 0; j < al2.size() ; j++) {
				if(al1.get(i).equals(al2.get(j))) {
					max = (int)al1.get(i);
				}
			}
		}
		
		int min =0;
		if(n !=0 && m!=0) {
	       min = (n*m)/max; 	
	        }
        
		answer[0] = max;
		answer[1] = min;
		return answer;
	}
}
