import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
      int[] answer = new int[commands.length];

        for( int i = 0; i < commands.length ; i++){
            int[] a = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            int[] b = Arrays.stream(a).sorted().toArray();
            answer[i] = b[commands[i][2]-1];
        }
        return answer;
    }
}
