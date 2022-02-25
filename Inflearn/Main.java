import java.util.Scanner;

public class Main {

    // 방법 1: for문 사용
//    public static String Solution(String a){
//        String b ="";
//
//        for(int i =0 ; i< a.length(); i++){
//            if(Character.isLowerCase(a.charAt(i))){
//                b += Character.toUpperCase(a.charAt(i));
//            }else{
//                b += Character.toLowerCase(a.charAt(i));
//            }
//        }
//        return b;
//    }

    // 방법 2 : forEach 사용
//    public static String Solution(String a){
//        String b = "";
//
//        for(char c : a.toCharArray()){
//            if(Character.isLowerCase(c)){
//                b += Character.toUpperCase(c);
//            }else{
//                b += Character.toLowerCase(c);
//            }
//        }
//        return b;
//    }

    // 방법3) 강사 코드, forEach문 사용
//    public static String Solution(String str){
//        String answer = "";
//        // toCharArray : 문자열을 char 타입 배열(array)으로 바꿔준다
//        for(char x : str.toCharArray()){
//            // Character.isLowerCase(x) : x가 소문자면 true, 대문자면 false
//            if(Character.isLowerCase(x)){
//                // 문자열 answer에다가 char타입 x를 UppserCase(대문자)로 변경해 준 뒤 추가
//                answer += Character.toUpperCase(x);
//            }else{
//            // Character.isUpperCase(x) : x가 대문자면 true, 소문자면 false
//                answer += Character.toLowerCase(x);
//            }
//        }
//
//        return answer;
//    }

    // 방법 4 : 아스킷 넘버 사용하기(내가)
//    public static String Solution(String a){
//        String answer = "";
//        for(char c : a.toCharArray()){
//           // 대문자인 경우 65~90, 소문자인 경우 97~122 : 소문자에서 -32 하면 대문자가 된다
//            if((int)c >= 65 && (int)c <=90){
//                answer += Character.toLowerCase(c);
//            }else if((int)c >=97 && (int)c <= 122){
//                answer += Character.toUpperCase(c);
//            }
//        }
//        return answer;
//    }

    public static String Solution(String str){
        // 방법 5) 아스킷 코드 사용하기(강사)
// 대문자인 경우 65~90, 소문자인 경우 97~122 : 소문자에서 -32 하면 대문자가 된다
        String answer = "";

        for(char x : str.toCharArray()){
            if(x >=97 && x <=122){          // 소문자 -32
                answer += (char)(x - 32);
            }else if(x >= 65 && x <=90){    // 대문자 +32
                answer += (char)(x + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(Solution(input1));
    }
}