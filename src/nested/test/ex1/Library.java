package nested.test.ex1;

public class Library {
    private Book[] books;
    private int count = 0;

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size) {
        this.books = new Book[size];
    }

    void addBook(String title, String author){
        if(count < books.length){
            books[count++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
    void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목 : " + book.title + ", 저자 : " + book.author);
        }
    }
}
