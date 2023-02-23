package main.java.programmers.level0;

public class 개미군단 {

    class Solution {
        public int solution(int hp) {
            int answer = 0;

            for(int i=5; i > 0; i-=2){
                answer += hp / i;
                hp %= i;
            }

            return answer;
        }
    }

}
