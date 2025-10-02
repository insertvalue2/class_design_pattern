package ch03.step01;

public class MainTest {

    public static void main(String[] args) {

        String message= "hello java";
        // 요청에 따라서 인코딩 하고 싶다.
        Encoder encoder = new Encoder();

        // Base64로 전략을 선택
        encoder.setEncodingStrategy(new Base64Strategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new AppendStrategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new UrlStrategy());
        System.out.println(encoder.getMessage(message));
    }
}
