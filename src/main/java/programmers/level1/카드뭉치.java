package main.java.programmers.level1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다.
 * 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
 *
 * 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
 * 한 번 사용한 카드는 다시 사용할 수 없습니다.
 * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
 * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
 *
 * 예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"],
 * 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면
 * 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
 *
 * 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때,
 * cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
 *
 */
public class 카드뭉치 {

    public String solution1(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        String answer = "Yes";

        for(int i=0; i<goal.length; i++){

            if( index1<cards1.length && cards1[index1].equals(goal[i])){
                index1++;
            }else if( index2<cards2.length && cards2[index2].equals(goal[i])){
                index2++;
            }else{
                answer = "No";
            }
        }
        return answer;
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";
    }

}
