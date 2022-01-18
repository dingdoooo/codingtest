class Solution {
    public String solution(String s) {
        String answer = "";
        int i = (s.length()/2);
        int j = (s.length()%2);
        
	    if(i >= 0) {
	    	if(j == 0){
	    		answer = s.substring(i-1,i+1);
	    	}else{
	    		answer = String.valueOf(s.charAt(i));
	    	}
	    	
	    }
	    return answer;
    }
}
