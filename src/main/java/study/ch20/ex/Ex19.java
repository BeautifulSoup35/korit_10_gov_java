package study.ch20.ex;
//### 문제 19. 도서 관리
//
//`Book` 클래스(isbn, title, author, price)와 `Library` 클래스를 구현하시오.
//
//- `Library` 내부: `Map<String, Book>` (ISBN→Book)
//- `void addBook(Book b)` — 등록
//- `Book findByIsbn(String isbn)` — ISBN 검색
//- `List<Book> findByAuthor(String author)` — 저자별 검색
//- `List<Book> findByPriceRange(int min, int max)` — 가격 범위 검색
//- `void printAll()` — 전체 도서 출력
//
//```java

import lombok.Builder;
import lombok.Data;

import java.util.*;

/// / 등록: 978-1("자바의 정석", "남궁성", 35000),
/// /       978-2("스프링 입문", "김영한", 32000),
/// /       978-3("이펙티브 자바", "조슈아", 36000)
/// / 저자 "남궁성" 검색: [자바의정석]
/// / 가격 33000~36000: [자바의정석,이펙티브자바]
//```
public class Ex19 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("978-1","자바의 정석","남궁성", 35000));

        library.printAll();
        System.out.println(
                library.findByAuthor("남궁성")
        );
        System.out.println(
                library.findByIsbn("978-1")
        );
        System.out.println(
                library.findByPriceRange(34000, 50000)
        );

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

@Data
class Library {
    private Map<String, Book> map = new HashMap<>();

    void addBook(Book b) {
        map.put(b.getIsbn(), b);

    }
    Book findByIsbn(String isbn) {
        if(map.containsKey(isbn)) {
            return map.get(isbn);

            //오류가능성
        }
        Book b = new Book("","","",0);
        System.out.println("찾으시는 책이 없습니다.");
        return b;

    }
    List<Book> findByAuthor(String author) {
        List<Book> books =  (List)map.values();
        List<Book> result = new ArrayList<>();
        for(Book b : books) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;
    }
    List<Book> findByPriceRange(int min, int max) {
        List<Book> findRange = new ArrayList<>();
        for(Book b : map.values()) {
            if(min > b.getPrice() &&  max <b.getPrice()){
                findRange.add(b);
            }
        }
        return findRange;
    }
    void printAll() {
        System.out.println("등록 : ");
        System.out.println(map);
    }
}