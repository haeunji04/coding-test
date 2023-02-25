package main.java.programmers.level0;

import java.util.Arrays;

/**
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 예) "hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
 *
 */
public class 문자반복출력하기 {

    public String solution1(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

//    * repeat : java 11 버전부터 가능

    public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }


    public String solution3(String my_string, int n){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }

    public void solution4(String my_string, int n){
        String[] strArray = my_string.split("");

        Arrays.stream(strArray).forEach(v -> {
            for (int i = 0; i < n; i++) {
                System.out.print(v);
            }
        });
    }

}
