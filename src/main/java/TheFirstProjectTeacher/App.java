package TheFirstProjectTeacher;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            //trim : 좌우 공백 제거
            if (command.equals("종료")) {
                break;
            }
        }
    }
}
