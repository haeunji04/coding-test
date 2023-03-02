package main.java.programmers.level0;

/**
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 *
 */
public class 문자열계산하기 {

    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = 0;

        for(int i=0; i<arr.length; i++){
            if(answer == 0){
                answer = Integer.parseInt(arr[i]);
            }
            switch(arr[i]){
                case "+":
                    answer += Integer.parseInt(arr[i+1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(arr[i+1]);
                    break;
                default: break;
            }
        }

        return answer;
    }

}
