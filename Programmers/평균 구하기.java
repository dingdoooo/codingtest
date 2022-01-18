class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double a = 0;
        
        for(int element : arr) {
        	a += element;
        }
        answer = (a/arr.length);
        return answer;
    }
}
