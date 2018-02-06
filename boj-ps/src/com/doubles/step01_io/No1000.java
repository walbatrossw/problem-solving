package com.doubles.step01_io;

import java.util.Scanner;

/**
 *
 * Step 01 - 입/출력 받아보기
 * No. 1000 : A+B
 * Q : A+B 출력하기
 *
 * */
public class No1000 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);

    }
}
