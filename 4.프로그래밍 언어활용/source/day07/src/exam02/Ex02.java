package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        //throw  new FileNotFoundException(..)
        try {

            FileInputStream fis = new FileInputStream("b.txt");

            System.out.println("파일 처리...");

        } catch (FileNotFoundException e) {

            System.out.println("예외발생!");
           // String message = e.getMessage();
           // System.out.println(message);
            e.printStackTrace();
        }
    }
}