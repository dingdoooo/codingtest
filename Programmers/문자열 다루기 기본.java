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

/*
[문제 설명]
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

[제한 사항]
s는 길이 1 이상, 길이 8 이하인 문자열입니다.

숫자인지 아닌지 확인하기위해 Character.isDigit() 함수사용
if(Character,isDigit(s.charAt(i)) == false : s의 i번째 index가 숫자가 아닌경우 > answer = false;
1) 문제에서 숫자로만 구성되어있는지 파악해야했으므로, 숫자가 아니면 false를 출력해야한다
2) 문자열 s의 길이가 4 or 6이다 : if(s.length() == 4 || s.length() == 6) 으로 판단, 아닌경우 else{ answer = false;} 반환

*/
