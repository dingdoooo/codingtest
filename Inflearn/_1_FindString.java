import java.util.Scanner;

public class _1_FindString {

//    public static int Solution(String a, char b) {
//        int index = 0;
//
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == b) {
//                index++;
//            }
//        }
//        return index;
//    }

    // forEach 사용하기
    public static int Solution(String a, char b){
        int index = 0;
        int i = 0;

        for(char c : a.toCharArray()){
            if(c == b){
                index++;
            }
        }
        return index;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();  // nextLine은 문자열 읽음
        String input2 = in.next().toLowerCase();      // next는 문자 1개 읽어들임
        String input = input1.toLowerCase();
        char c = input2.charAt(0);

        System.out.println(Solution(input,c));

    }

}
