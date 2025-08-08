package ch13_inheritance.products.books;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("자바의 정석"," 남궁성");
        book.getTitle();
        book.showInfo();

        System.out.println();

        EBook eBook = new EBook("스프링 입문", " 이강준",   5.2,"EPUB");
        eBook.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + eBook.getFormat() + " 입니다.");
        eBook.showInfo();



    }
}
