public class Main {


        public static long solution(long n) {

            // long > String으로 바꾸기
            String s = Long.toString(n);

            // String 배열로 바꿔서 내림차순 정렬하기
            String[] arrs = s.split("");
            Arrays.sort(arrs, Collections.reverseOrder());

            // 다시 String으로 변환
            s = String.join("",arrs);

            // 다시 long으로 변환
            long answer = Long.parseLong(s);

            return answer;
            }
}

