package ch03;

import java.util.Base64;

/**
 * 전략 패턴이 없는 코드를 사용해 보자.
 * 문제 : 텍스트를 인코딩하는 방식이 여러가지 일 때, 우리는 Encoder 클래스를 설계 해 볼 수 있다.
 *
 */

/**
 * OCP
 * 기능에 확장에 있어서는 열여 있어야 한다.
 * 기존 코드에 수정안 닫혀 있어야 한다.
 * 새로운 인코딩 형태가 추가 된다면 매번 if else 구문을 직접 수정해야 된다.
 */
class Encoder {
    public String encode(String text, String format) {
        if("base64".equalsIgnoreCase(format)) {
            return Base64.getEncoder().encodeToString(text.getBytes());
        } else if("append".equalsIgnoreCase(format)) {
            return "ABC:" + text;
        } else {
            return text;
        }
    }
}



// 클라이언트 클래스
public class BadEncode {


    // 코드의 진입점
    public static void main(String[] args) {

        Encoder encoder = new Encoder();
        String message = "Hello Java";

        System.out.println(encoder.encode(message, "base64"));
        System.out.println(encoder.encode(message, "append"));
    } // end of main

}
