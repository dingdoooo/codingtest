

package programmers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _02mockTest {

  // Map : https://wikidocs.net/208
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hs = new HashMap<>();

        // participant : 참여자의 HashMap을 만들기 위함
        for(String player : participant){
            /*
            * participant에 있는 player들을 가지고와서 hs에 put(데이터 추가)
             1) 새로 들어가는 player : defaultValue = 0 -> 0+1= 1 이 Value값으로 들어간다.
             2) 동명이인 player : 원래 매핑되어있던 값 = 1 -> 1+1 =2 가 Value값으로 들어간다.
             */
            hs.put(player, hs.getOrDefault(player,0)+1);
        }

        // completion : 완주자 대상으로 Value값을 -1 해주기
        for(String player : completion){
        /*
        1) 이름이 겹치지 않는 player는 Value값이 대부분 1이다 > Value : 1-1 = 0
            >> 완주를 했으면 hs.get(player)-1를 통해 Value값이 0이된다.
        2) 동명이인의 경우 Value값이 1보다 크다.  > Value : 2-1 =1
         */
            hs.put(player, hs.get(player)-1);
        }

        for(String player : hs.keySet()){
            // player의 Value값이 0이 아니면 완주하지 못한 사람!
            if(hs.get(player)!=0){
                answer = player;
            }
        }

        return answer;
    }
}


/*

[문제 설명]
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

[제한사항]
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.


# issue1
     
     ArrayList a = new ArrayList(Arrays.asList(participant));
     ArrayList b = new ArrayList(Arrays.asList(completion));

     List<String> merge = new ArrayList<>(a);
     merge.removeAll(b);

원래는 ArrayList에 participant, completion을 각각 집어넣은 후,
ArrayList 클래스 내의 removeAll() 메소드를 사용하려고 했다.

[문제]
이 경우는 동명이인일 때를 고려할 수 없었고, ArrayList 내에 남아있는 데이터가 없었다.
>> 이 때쯤 ArrayList로 풀기 포기함..



# issue2 
Map을 정확하게 파악하지 못해서 HashMap으로 풀고싶지 않았다.
그래도 공부해야지

* Map : key-Value를 한 쌍으로 갖는 자료형이다.
  [특징]
  1) 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고, key나 value를 통해 얻는다.
  2) 맵(Map)의 가장 큰 특징은, key로 value값을 얻어낸다는 점이다.
  
  3) baseball이란 단어의 뜻을 찾기 위해 Map을 순차적으로 모두 검색하는것이 아니라,
     baseball이라는 단어가 있는 곳만 펼쳐본다.
    key	      value
    people	  사람
    baseball	야구
 
 
 * HashMap : 자바의 맵(Map)중에서 가장 간단하다.
 : Map역시 List와 마찬가지로 인터페이스이다.
 Map 인터페이스를 구현한 Map 자료형에는 HashMap, LinkedHashMap, TreeMap등이 있다.
 
   1. put() : key, value를 HashMap에 추가해줄 수 있는 메소드
     ex) 
     HashMap<String, String> map = new HashMap<>();
     map.put("진주","173");
  
  
  2. get() : key에 해당하는 value를 얻기 위함
  ex) System.out.println(map.get("진주")); // "173"출력
 
    ** getOrDefault()
    : 맵의 key에 해당하는 value가 없을 경우, get 메소드를 사용하면 null이 리턴된다.
    ex) System.out.println(map.get("진")); // null 출력
    
    : null 대신 default값을 얻고 싶은 경우에는, getOrDefault() 메소드 사용한다.
    ex) System.out.println(map.getOrDefault("진","기본값")); // "기본값" 출력


  3. containsKey : 맵(Map)에 해당하는 키(key)가 있는지 그 결과 값을 알려준다
  ex) System.out.println(map.containsKey("진주")); // true 출력
  
  
  4. remove() : 맵(Map)의 항목을 삭제하는 메소드,
                해당하는 키(key)에 해당하는 아이템(key,value)를 삭제한 후 그 value값을 리턴한다.
  ex) System.out.println(map.remove("진주")); // "173" 출력
  
  
  5. size() : 맵(Map)의 개수를 리턴한다.
   ex) System.out.println(map.size()); // 0출력 (진주가 삭제됐음)
   
   
  6. keySet() : 맵(Map)의 모든 key를 모아서 리턴한다.
  ex)
    HashMap<String, String> map = new HashMap<>();
    map.put("people", "사람");
    map.put("baseball", "야구");
    System.out.println(map.keySet());  // [baseball, people] 출력
   
   >> keySet()은 Map의 모든 key를 모아서 Set자료형으로 리턴한다.
   >> Set 자료형은 List 자료형으로 바꾸어야 사용할 수 있다.
      List<String> keyList = new ArrayList<>(map.keySet());


Q. Map에서 정렬된 데이터를 가져오고 싶은 경우는 어떻게 할까?
A. Map의 가장 큰 특징은 순서에 의존하지 않고, key로 value를 가져오는 데 있다.
하지만, 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고
때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶은 경우도 있을 것이다.
이런 경우에는, LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.

* LinkedHashMap : 입력된 순서대로 데이터를 저장
* TreeMap : 입력된 key의 오름차순 순서로 데이터를 저장
  


# issue3
getOrDefault
: 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메소드

    // getOrDefalut()메소드 이해를 위한 실행 코드
    //https://junghn.tistory.com/entry/JAVA-Map-getOrDefault-%EC%9D%B4%EB%9E%80-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%B0%8F-%EC%98%88%EC%A0%9C
    public static void main(String[] args) {
        String[] al = {"a", "b", "c", "b"};
        HashMap<String, Integer> hs = new HashMap<>();
        for (String key : al) {
            **hs.put(key, hs.getOrDefault(key, 0) + 1);
        }
        System.out.println("결과" + hs);
    }
    
** b는 2번 존재하기 때문에 첫번째 b에서는 key가 없었기 때문에 default = 0 을 반환, 이후 +1 >> b = 1
** getOrDefault()에 의해서 해당 key에 매핑되어있는 값 : 1 을 반환, 이후 +1 >> b = 2;
            


*/
