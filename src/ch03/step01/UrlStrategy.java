package ch03.step01;

public class UrlStrategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return "URL 인코딩 %: " + text + "%%";
    }
}
