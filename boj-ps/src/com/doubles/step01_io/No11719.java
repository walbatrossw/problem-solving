package com.doubles.step01_io;

import java.util.Scanner;

/**
 *
 * Step 01 - 입/출력 받아보기
 * No. 11719 : 그대로 출력하기2
 * Question : 입력 받은 대로 출력하는 프로그램을 작성하시오.
 * Input : 입력이 주어진다.
 *         입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 *         각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 * */

public class No11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
