package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","orange","mango","melon");
        fruits.stream().map(s -> "*" + s + "*") //중간연산
                .map(String::toUpperCase) //중간연산
                .forEach(System.out::println); //최종연산

        System.out.println(fruits);
    }
}
