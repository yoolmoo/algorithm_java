package algo;

import java.util.Scanner;

class Day {
    private String work; // 하루의 할 일을 나타내는 문자열

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null) {
            System.out.println("없습니다.");
        } else {
            System.out.println(work + "입니다.");
        }
    }
}

public class Excercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int button;
        int date = 0;
        String work = null;

        System.out.println("이번달 스케줄 관리 프로그램.");

        do {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3)>> ");
            button = scanner.nextInt();

            if (button == 1) {
                System.out.print("날짜(1~30)? ");
                date = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("할일(빈칸없이입력)? ");
                work = scanner.nextLine();
                System.out.print("\n");

            } else if (button == 2) {
            	System.out.print("날짜(1~30)? ");
                date = scanner.nextInt();
                scanner.nextLine();
                System.out.println(date + "일의 할 일은 " + work + "입니다.\n");
                System.out.print("\n");
            }
        } while (button != 3);

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}


