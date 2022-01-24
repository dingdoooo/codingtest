class Solution {
    public boolean solution(int x) {
       boolean answer = true;
        int sum = 0;
        int i = x;

        while(i > 0){
            sum += (int)(i%10);
            i = (int)(i/10);
        }

        if((x%sum)==0 ){
            answer = true;
        }else{
            answer =false;
        }
        return answer;
    }

}

/*
[문제 설명]
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

[제한 조건]
x는 1 이상, 10000 이하인 정수입니다.

# issue 1
[문제] Exception in thread "main" java.lang.ArithmeticException: / by zero 발생
sum += (int)(x%10);로 적어놔서 발생했다 
[해결] sum += (int)(i%10);로 변경

# issue 2
while(x>0){
  sum += (int)(x%10);
  x = (int)(x/10); }
 으로 한 경우
    
    public static int solution2(int x) {
        int answer = 0;
        int sum = 0;

        while(x>0){
            sum += (int)(x%10);
            x = (int)(x/10);
        }

       answer = x%sum;
        return answer ;
    }
[문제] (x%sum)값을 확인하기 위해 solution2() 메소드를 만들었는데, 자꾸 answer = 0이 나왔다.
아마 while()문에 x를 집어넣고난 후 ,x값이 변경되었기 때문에 생긴 문제라고 생각 됐다.

[해결]
answer = x%sum; 값에서 사용하는 x가 변경되지 않고 입력받은 그대로를 유지하기 위해
int i = x; 를 추가, while()문의 모든 x를 i로 변경

# 함수 설명
ex) x = 13
1) i = 13, sum = (13%10) = 3 -> i = (13/10) = 11
2) i = 3, sum = (1%10) = 1 +3 = 4 -> i = (1/10) = 0

x = 13, sum = 4 -> x%sum = 13%4 = 1 (나눠떨어지지 않음)
answer = false;



*/
