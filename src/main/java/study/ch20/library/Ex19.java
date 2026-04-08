package study.ch20.library;

import lombok.Builder;
import lombok.Data;

import java.util.*;

public class Ex19 {
    public static void main(String[] args) {
        String serchAuthor = "남궁성";
        Library library = new LibraryImpl();
        library.addBook(new Book("978-1","자바의 정석","남궁성", 35000));
        library.addBook(new Book("978-2", "스프링 입문", "김영한", 32000));
        library.addBook(new Book("978-3", "이펙티브 자바1", "조슈아", 36000));
        library.addBook(new Book("978-4", "이펙티브 자바2", "조슈아", 36000));
        library.addBook(new Book("978-5","자바의 정석1","남궁성", 35000));
        library.addBook(new Book("978-6","자바의 정석2","남궁성", 35000));
        library.addBook(new Book("978-7","자바의 정석3","남궁성", 35000));

        Book foundBook = library.findByIsbn("978-2");
        System.out.println(foundBook);
        library.findByAuthor(serchAuthor).forEach(System.out::println);
        System.out.println(library.findByPriceRange(35000, 36000));
    }
}

@Data
@Builder
class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;

}

class LibraryImpl implements Library {
    private Map<String, Book> bookMap;

    public LibraryImpl() {
        bookMap  = new HashMap<>();
    }

    @Override
    public void addBook(Book b) {
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book b : bookMap.values()) {
            if (b.getAuthor().equals(author)) foundBooks.add(b);
        }

        return foundBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book b : bookMap.values()) {
            if (b.getPrice()>= min && b.getPrice() <= max) foundBooks.add(b);
        }
        return foundBooks;
    }

    @Override
    public void printAll() {
       for(Book book : bookMap.values()) {
           System.out.println(book);
       }
    }
}

interface Library {
    void addBook(Book b);
    Book findByIsbn(String isbn);
    List<Book> findByAuthor(String Author);
    List<Book> findByPriceRange(int min, int max);
    void printAll();
}