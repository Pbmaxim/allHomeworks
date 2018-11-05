package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Введите начальное кол-ва книг (от 0 до 1000)");
        Book book = new Book(scanner.nextInt());
        int answer1;

        while (true) {
            System.out.println("Введите действие ");
            System.out.println("");
            System.out.println("1 - добавить книгу");
            System.out.println("2 - удалить книгу");
            System.out.println("3 - прекратить работу программы");
            answer1 = scanner.nextInt();
            if (answer1 == 1) {
                System.out.println("Введите кол-во книг, которое необходимо добавить");
                int countBook = scanner.nextInt();
                library.put(book, countBook);
            } else if (answer1 == 2) {
                System.out.println("Введите кол-во книг, которое необходимо забрать");
                int countBook = scanner.nextInt();
                library.get(book, countBook);
            } else if (answer1 == 3) {
                System.exit(0);
            } else {
                System.out.println("Вы ввели неккоректную команду");
            }
        }


//        library.get(book,2);
//        library.put(book,2);
    }
}
