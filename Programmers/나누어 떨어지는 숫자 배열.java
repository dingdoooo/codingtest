import java.util.*;
import java.util.stream.Collectors;

class Solution {
       public static ArrayList solution(int[] arr, int divisor) {
        ArrayList answer = new ArrayList();


        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0 ){
                answer.add(arr[i]);
            }
        }

        if(answer.isEmpty()){
            answer.add(-1);
        }

        Collections.sort(answer);
        return answer;

    }
}

/*
[문제 설명]
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

[제한사항]
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

# issue 1
원래는 int[] answer; 이지만, Array로 푸는게 익숙하지 않아서 ArrayList로 변경했다. 
int[] answer = {}; -> ArrayList answer = new ArrayList();

# issue 2
[문제] if(answer == null)로 작성한 경우, answer.add(-1)이 추가되지 않았다.
answer.add(-1)이 문제인가 싶어서, int[] a = {-1}을 만든 후, answer.add(a);를 넣었다.
하지만, 출력되는건 a의 주소값이길래, answer == null이 잘못된 것인지 의심함
[해결] if(answer.isEmpty()), answer.add(-1)로 변경

# issue 3
[문제] ArrayList 정렬하는 방법을 모름
[해결] Collections 클래스에 있는 sort()메소드를 사용해서 answer을 오름차순으로 정렬했다.
https://hianna.tistory.com/569
* Collections.sort()는 무조건 오름차순인 것 같다.

*/
