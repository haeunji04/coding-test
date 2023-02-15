package main.java.programmers.level0;

import java.util.Arrays;

public class 배열의평균값 {

    public double solution(int[] numbers) {
        int sum = (int) Arrays.stream(numbers).sum();
        int count = (int) Arrays.stream(numbers).count();

        return (double) sum / count;
    }

}
