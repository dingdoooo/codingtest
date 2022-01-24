class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int a = phone_number.length();
        String star = "*";
        
        answer =  star.repeat(a-4) + phone_number.substring(a-4);
        //answer = "*".repeat(a-4) + phone_number.substring(a-4);
      
        return answer;
    }

}

/*
[문제 설명]
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

[제한 조건]
s는 길이 4 이상, 20이하인 문자열입니다.

# issue 1
String star = "*"; ,star.repeat(a-4) >> "*".repeat(a-4)으로 변경 가능

# issue 2
substring(a-4) : String 값인지 모르고 
int에서 String값으로 바꿔주는 메소드인 Integer.toString() 사용하려했다.

# 함수 설명
마지막 4자리 숫자를 얻어오고 싶은거니까, phone_number의 문자열 길이를 a에 집어넣고, 
문자열을 나눌 수 있는 substring()메소드를 사용해 (a-4)까지만 가져온다

*/
