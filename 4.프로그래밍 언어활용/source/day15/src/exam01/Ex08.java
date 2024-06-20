package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
       // String str = "ABC";
        String str = null;
       // Optional<String> opt = Optional.of(str); null은 허용 x
        Optional<String> opt = Optional.ofNullable(str); //null 허용
        //System.out.println(opt.get()); //null이면 NOSuchElementException발생
        String value = opt.orElse("기본값");
        System.out.println(value);

    }
}
