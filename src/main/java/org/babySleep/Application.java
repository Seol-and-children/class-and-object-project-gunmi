package org.babySleep;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Mother mom = new Mother();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("==========아이 재우기==========");
            System.out.println("====아래 순서대로 하세요!!===");
            System.out.println("1. 씻기기 ");
            System.out.println("2. 우유 먹이기 ");
            System.out.println("3. 침대에 눕히기 ");
            System.out.println("4. 동화책 읽어주기 ");
            System.out.println("9. 프로그램 종료 ");
            System.out.print("행동 선택 ");
            int no  = sc.nextInt();

            switch (no) {
                case 1: mom.washBaby();break;
                case 2: mom.eatmilk();break;
                case 3: mom.goToSleep();;break;
                case 4: mom.readBook();break;
                case 9: return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력하세요.");

            }
        }while(true);
    }
}
