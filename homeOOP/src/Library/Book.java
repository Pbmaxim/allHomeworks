package Library;

public class Book {
    public int book;


    public Book(int book) {
        if ((book >= 0) && (book <= 1000)) {
            this.book = book;
        } else {
            System.out.println("Введенное кол-во книг не соответсвует требованиям!");
            System.exit(0);
        }
    }

    public void setBook(int countBook) {
        if (book + countBook <= 1000) {
            book = book + countBook;
            System.out.println("В библиотеке " + book + " книг");
        } else {
            System.out.println("Слишком много книг в библиотеке. Невозможно добавить такое кол-во!");
        }
    }


    public int getBook(int countBook) {
        if ( book - countBook >= 0 ){
            book = book - countBook;
            System.out.println("В библиотеке " + book + " книг");
            return book;
        } else {
            System.out.println("Слишком мало книг в библиотеке. Невозможно взять такое кол-во!");
            System.out.println("В библиотеке " + book + " книг");
            return book;
        }

    }

}
