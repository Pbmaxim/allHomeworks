/*1) Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
*/
package str1;
import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String message = scanner.next();

        System.out.println("Введите необходимую для замены подстроку");
        String substring = scanner.next();

        System.out.println("Введите подстроку на которую будет производиться замена");
        String substringNew = scanner.next();

        String newMessage = "";

        newMessage = message.replace(substring, substringNew);
        System.out.println(newMessage);
    }
}
