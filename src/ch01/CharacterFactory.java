package ch01;

/**
 * 팩토리 패턴이란?
 * 클라이언트가 객체를 생성하는 구체적인 로직을 직접 알 필요 없이
 * 팩토리에 어떤 객체를 원한다고 요청을 하면 팩토리가 해당 객체를 알아서 생성하여
 * 돌려주는 디자인 패턴입니다.
 * 마치 실생활에 자판기와 같습니다.
 */
public class CharacterFactory {

    // 동작은 메서드를 통해서 설계한다.
    public Character createCharacter(String type) {
        if(type.equals("워리어")) {
            return new Warrior();
        } else if (type.equals("매지")) {
            return new Mage();
        } else if (type.equals("아처")) {
            return new Archer();
        } else {
            // null 보다는 예외를 던져 주자.
            throw new IllegalArgumentException("지원하지 않는 캐릭터 타입 입니다.");
        }
    }
}
