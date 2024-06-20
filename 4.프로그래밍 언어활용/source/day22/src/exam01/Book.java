package exam01;

import java.io.Serializable;
import java.rmi.server.UID;

public class Book implements Serializable {

    private static final long serialVersionUID =1L;

    private int isbn; //도서 번호
    private  String title; //도서명
    private transient String author; //저자  transient : 직렬화 배제

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
