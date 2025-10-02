package ch01;

import java.util.Scanner;

/**
 * 팩토리 패턴이 없을 때의 코드를 살펴 보자.
 */
public class BadGame {

    // 코드의 진입점
    public static void main(String[] args) {

        System.out.println("캐릭터를 선택하세요 (워리어, 매지, 아처)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        Character character;

        // 동적으로 객체으로 객체를 생성
        if (choice.equals("워리어")) {
            // 워리어 객체 생성
            character = new Warrior();
        } else if(choice.equals("매지")) {
            // 매지 객체 생성
            character = new Mage();
        } else if(choice.equals("아처")) {
            // 아처 객체 생성
            character = new Archer();
        } else {
            System.out.println("잘못된 선택 입니다");
            return;
        }
        character.attack();
    } // end of main
}

/**
 * 책임의 집중 - 게임 클래스는 게임을 진행하는 책임과 캐릭터를 생성하는 책임을 모두 가지고 있다
 * (단일 책임 원칙에 위배 )
 * 확장의 어려움 - 만약 힐러라는 직업이 추가된다면 if-else 구문을 직접 수정해야 된다.
 * (개방-폐쇄에 원칙 위배)
 * 코드의 복잡성
 */