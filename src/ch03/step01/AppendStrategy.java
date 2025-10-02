package ch03.step01;

public class AppendStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return "ABC:" + text;
    }
}
