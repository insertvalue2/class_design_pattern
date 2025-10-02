package ch03.step01;

/**
 * 핵심 코드 - 전략을 사용하는 주체
 */
public class Encoder {
    // 인터페이스 타입의 전략을(인코딩 형태 클래스) 필드로 가짐.
    private EncodingStrategy encodingStrategy;

    // 전략을 동적으로 교체 하는 메서드
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

}
