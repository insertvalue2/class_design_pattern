package ch01;

import java.util.Scanner;

// 클라이언트 객체
public class GoodGame {

    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactory();
        System.out.println("캐릭터 선택 (...)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        try {
            // 클라이언트는 팩토리에 요청함 하면 끝 !!
            // 어떤 구체적인 클래스가 생성되는지 알 필요가 없다.
            // 이 코드는 절대 수정할 일이 없다. 왜? 힐러 객체가 필요하면 팩토리 클래스만 수정하면 된다.
            Character character = factory.createCharacter(choice);
            character.attack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
