package org.example;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱==");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("명령) "); //왜 그냥 print가 아닌 printf인지?
            String order = sc.nextLine();
            if (order.equals("종료")){
                break;
            }
        }
        sc.close();
    }
}

