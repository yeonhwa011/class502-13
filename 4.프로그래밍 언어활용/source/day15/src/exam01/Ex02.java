package exam01;

import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1,100).filter(x-> x % 2 == 0).sum();
        System.out.println(total);
    }
}
