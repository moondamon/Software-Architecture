package book;

import book.interfaces.InterfaceBookPublisher;
import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        InterfaceBookPublisher book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
