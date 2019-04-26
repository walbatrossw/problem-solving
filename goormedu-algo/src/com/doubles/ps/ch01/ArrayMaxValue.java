package com.doubles.ps.ch01;

import java.util.Scanner;

// 배열 최대값 구하기
public class ArrayMaxValue {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 배열의 최대값을 계산하는 함수.
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]중 최대값.
     */
    public static int getMax(int[] data, int n) {
        int answer = data[0];
        for (int i = 0; i < n; i++) {
            if (answer < data[i]) {
                answer = data[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        int answer = getMax(data, n);

        System.out.println(answer);
    }
}
