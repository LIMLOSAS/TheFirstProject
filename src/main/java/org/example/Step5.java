package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Step5 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱==");

        Scanner sc = new Scanner(System.in);

        List<FamousSaying> famousSaying = new ArrayList<>();

        int repeat = 1;

        while (true) {
            System.out.printf("명령) "); //왜 그냥 print가 아닌 printf인지?
            String order = sc.nextLine();
            if (order.equals("등록")) {
                for (int i = 0; i < repeat; i++) {
                    String saying;
                    String writer;
                    System.out.printf("명언 : ");
                    saying = sc.nextLine();
                    System.out.printf("작가 : ");
                    writer = sc.nextLine();
                    System.out.println(repeat + "번 명언이 등록되었습니다.");
                    repeat++;

                    famousSaying.add(new FamousSaying(repeat, writer, saying));
                }
            } else if (order.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = 0; i < repeat; i++) {
                    famousSaying = famousSaying
                            .stream()
                            .sorted((e2, e1) -> e1.getRepeat() - e2.getRepeat())
                            .collect(Collectors.toList());
                    System.out.println(famousSaying);
                }
            } else if (order.equals("종료")) {
                break;
            }
        }
        sc.close();
    }
}

class FamousSaying {
    private int repeat;
    private String order2;
    private String order3;

    public FamousSaying(int repeat, String writer, String saying) {
        //this.repeat = repeat;
    }

    public int getRepeat() {
        return repeat;
    }

    @Override
    public String toString() {
        return "FamousSaying{" +
                "repeat=" + repeat +
                ", order2='" + order2 + '\'' +
                ", order3='" + order3 + '\'' +
                '}';
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