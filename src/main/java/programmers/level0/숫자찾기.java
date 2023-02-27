package main.java.programmers.level0;

public class 숫자찾기 {

    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer != -1 ? answer+1 : answer;
    }

}
