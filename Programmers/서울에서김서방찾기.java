class Solution {
    
    String[] seoul = {"Jane","Kim"};
    
    public int getIndex(String[] seoul){
       for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return i;
            }
        }
        return 0;
    }
    
    public String solution(String[] seoul) {
        int wherekim = getIndex(seoul);
        String answer = "김서방은 " + Integer.toString(wherekim) + "에 있다";
        return answer;
    }
}
