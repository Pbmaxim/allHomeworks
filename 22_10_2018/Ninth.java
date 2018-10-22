/*
 Задача 9*
Задать количество тарелок и количество моющего средства.
Моющее средство расходуется из расчета 0,5 на одну тарелку.
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
В конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот.
*/
import java.util.Scanner;
public class Ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте количество тарелок");
        int plate = scanner.nextInt();
        System.out.println("Напишите количество моющего ср-ва");
        double soap = scanner.nextDouble();

        if ( plate <= 2*soap ){
            while (plate > 0){
                plate--;
                System.out.println("Тарелок осталось: " + plate);
                soap= soap - 0.5;
                System.out.println("Моющего средства осталось: " + soap);
            }
            System.out.println("Все тарелки вымыты. Моющего ср-ва осталось: " + soap);
        } else {
            while (soap > 0){
                soap= soap - 0.5;
                System.out.println("Моющего средства осталось: " + soap);
                plate--;
                System.out.println("Осталось " + plate + " тарелок");
            }
            System.out.println("Моющее средство закончилось. Осталось грязных тарелок: " + plate);
        }
    }
}
