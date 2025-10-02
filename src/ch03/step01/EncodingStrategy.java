package ch03.step01;

/**
 * 전략 패턴이란?
 * 동작 방식을 캡슐화하여
 * 동적으로 전략을 변경할 수 있도록 허용하는 디자인 패턴 입니다.
 * 특정 기능을 수행할 여러 방법이 있을 때, 그 방법들을 정의(클래스)하고
 * 필요에 따라서 적절한 전략을 선택해서 사용할 수 있습니다.
 */

public interface EncodingStrategy {
    String encode(String text);
}
