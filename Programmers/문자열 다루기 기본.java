class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            if(s.length() ==4 || s.length() ==6){
                for(int i = 0; i < s.length(); i++){
                    if(Character.isDigit(s.charAt(i)) == false){
                        answer = false;       
                    }
                }
                
            }else{
                answer = false;
            }
            return answer;
        }
}


// 숫자인지 아닌지 확인하기위해 Character.isDigit() 함수사용
//
