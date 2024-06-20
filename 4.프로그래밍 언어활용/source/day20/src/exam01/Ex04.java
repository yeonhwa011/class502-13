package exam01;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // 1바이트 단위 스트림
        InputStreamReader isr = new InputStreamReader(in); //InputStream ->문자단위형
        char ch = (char)isr.read();
        System.out.println(ch);

    }
}
