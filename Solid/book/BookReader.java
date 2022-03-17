package book;

import book.interfaces.InterfaceBookReader;
import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        InterfaceBookReader book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
