package main.java.programmers.level0;

/**
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class 모음제거 {

    public String solution1(String my_string) {

        String[] arr = {"a", "e", "i", "o", "u"};

        for(int i=0; i<arr.length; i++){
            my_string = my_string.replace(arr[i], "");
        }

        return my_string;
    }

    public String solution2(String my_string) {

        return my_string.replaceAll("[aeiou]", "");
    }

}
