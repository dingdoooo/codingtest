class Solution {
  
      // 소수 판별하는 메소드 만들기
    public static boolean isPrime(int num) {
        // 4 때문에 i <= Math.sqrt(num);
        for (int i = 2 ; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int solution(int n) {
        int answer = 0;
        int i = 2;

        while(i <= n){
            if(isPrime(i) == true){
                answer++;
            }
            i++;
        }
        return answer;
    }
}

/*
https://programmers.co.kr/learn/courses/30/lessons/12921
[문제 설명]
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

[제한 조건]
n은 2이상 1000000이하의 자연수입니다.

# issue 1
지금까지는 한 메소드 내에서 모든걸 해결하려했어서 문제가 안풀렸는데,
isPrime() 메소드처럼 소수인지 아닌지 판별해주는 메소드를 따로 만들어도 된다는걸 지금 깨달음..!!
>> solution() 메소드 내에 다 해결하려 하지말자!

# issue 2
https://cjlee38.github.io/btb/ways_to_find_prime_number
isPrime() : num이 소수인지 아닌지 판별하는 메소드
Math.sqrt()를 사용한 이유 : 결론은 굳이 소수인지 아닌지 판별하기위해 n까지 다 나눠볼 필요가 없음 ㅎ;

  어떤 수의 약수를 쭉 나열하면, 다음과 같은 규칙을 발견할 수 있다.

  1. 약수의 개수는 반드시 짝수이다.
  2. index(i) , index(n-i-1) (n은 약수의 길이, i는 n보다 작은 임의의 수) 를 곱하면 원래의 수가 나온다.

# issue 3
for(int i =0; i < Math.sqrt(num); i++) 로 했을 때 4가 true(소수이다)라고 판정남
i <= Math.sqrt(num)으로 바꿔주니 말끔하게 바뀜 ㅎ


*/
