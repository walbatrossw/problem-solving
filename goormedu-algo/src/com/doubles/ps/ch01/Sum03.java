package com.doubles.ps.ch01;

import java.util.Scanner;

// 합구하기 3
public class Sum03 {

    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 1부터 N까지의 자연수의 합을 계산하는 함수
     *
     * @param i
     * @return
     */
    public static int getRangeSumFromOne(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j += 1) {
            sum += j;
        }
        return sum;
    }


    public static long getAnswer(int N) {
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            int rangeSum = getRangeSumFromOne(i);
            answer += rangeSum;
        }
        return answer;
    }


    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();

        long answer = getAnswer(n);

        System.out.println(answer);
    }

}
