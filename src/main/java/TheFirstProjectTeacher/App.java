package TheFirstProjectTeacher;

import TheFirstProjectTeacher.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        long lastWiseSayingId =0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            //trim : 좌우 공백 제거

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                long id = lastWiseSayingId + 1;
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);


                System.out.printf("%d번 명령이 등록되었습니다.\n", lastWiseSayingId);
                lastWiseSayingId = id;
            } else if (command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));

                for (int i = wiseSayings.size() - 1; i >= 0 ; i--) {
                    WiseSaying wiseSaying = wiseSayings.get(i);

                    System.out.printf(" %d / %s / %s \n", wiseSaying.getId(), wiseSaying.getAuthorName(),wiseSaying.getContent());
                }
            }
        }
    }
}
