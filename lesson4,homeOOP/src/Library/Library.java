package Library;

public class Library {


    void put(Book book, int quantity){
        book.setBook(quantity);

    }

    int get(Book book, int quantity){
        return book.getBook(quantity);
    }
}
