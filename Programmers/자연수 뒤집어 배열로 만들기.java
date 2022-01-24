import java.util.*;

class Solution {
    public static ArrayList solution(long n) {
        
        ArrayList answer = new ArrayList();
        int a;

        while(n>0){
               a = (int)(n%10);
               answer.add(a);
                n = (int)(n/10);
            }
        return answer;
        }
}

/* 
[문제 설명]
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

[제한 조건]
n은 10,000,000,000이하인 자연수입니다.

# issue 1
처음에는 int[]로 하려 했는데, 
a = (int)n%10;
answer[i] = a; 에서 자꾸 indexBound 오류가 떠서 ArrayList로 만들어줬다.

# issue 2
입력받은 n이 double 타입이므로 int타입으로 형변환 하는 과정에서 에러가 발생
a = (int)n%10;  -> a = (int)(n%10);
n = (int)n/10;  -> n = (int)(n/10);

# issue 3
answer[i] = a; 였을 때,
int i = 0;을 while문에 넣어놨어서 answer[0] 만 초기화 하고있는 상황이었다.
int i = 0;을 while문 밖으로 넣었었는데, int[]를 ArrayList로 변경하고 나서는 index값을 지정해줄 필요가 없어서 삭제

# 함수 설명
n = 12345를 받으면, a = (12345%10) = 5가 초기화 -> answer.add(a) = [5]추가 -> int(n/10) = int(12345/10) = int(1234.5) -> n = 1234 초기화
n = 1234를 받게됨 -> 반복


*/

