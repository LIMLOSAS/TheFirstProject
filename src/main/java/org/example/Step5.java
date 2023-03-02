package org.example;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱==");

        Scanner sc = new Scanner(System.in);



        int repeat = 1;

        while (true) {
            System.out.printf("명령) "); //왜 그냥 print가 아닌 printf인지?
            String order1 = sc.nextLine();
            if (order1.equals("등록")) {
                System.out.printf("명언 : ");
                String order2 = sc.nextLine();
                System.out.printf("작가 : ");
                String order3 = sc.nextLine();
                System.out.println(repeat + "번 명언이 등록되었습니다.");
                repeat++;
            } else if (order1.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = 0; i < repeat; i++) {
                    System.out.println(repeat + order3 + order2);
                }
            } else if (order1.equals("종료")) {
                break;
            }
        }
        sc.close();
    }
}

// 7번째줄부터
//         System.out.println("== 명언 앱==");
//
//        Scanner sc = new Scanner(System.in);
//
//        int repeat = 1;
//
//        while (true) {
//            System.out.printf("명령) "); //왜 그냥 print가 아닌 printf인지?
//            String order1 = sc.nextLine();
//            if (order1.equals("등록")) {
//                System.out.printf("명언 : ");
//                String order2 = sc.nextLine();
//                System.out.printf("작가 : ");
//                String order3 = sc.nextLine();
//                System.out.println(repeat + "번 명언이 등록되었습니다.");
//                repeat++;
//            } else if (order1.equals("목록")) {
//                System.out.println("번호 / 작가 / 명언");
//                System.out.println("----------------------");
//                for (int i = 0; i < repeat; i++) {
//                    System.out.println(repeat + order3 + order2);
//                }
//            } else if (order1.equals("종료")) {
//                break;
//            }
//        }
//        sc.close();