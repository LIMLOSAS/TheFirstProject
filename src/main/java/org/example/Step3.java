package org.example;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱==");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("명령) "); //왜 그냥 print가 아닌 printf인지?
            String order1 = sc.nextLine();
            if (order1.equals("등록")) {
                System.out.printf("명언 : ");
                String order2 = sc.nextLine();
                System.out.printf("작가 : ");
                String order3 = sc.nextLine();
                System.out.println("1번 명언이 등록되었습니다.");
            } else if (order1.equals("종료")) {
                break;
            }
        }
        sc.close();
    }
}

