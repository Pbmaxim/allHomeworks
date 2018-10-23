/*Задача 4*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера
 из случайных целых чисел из [-5;5] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
*/
package secondMass;

import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        System.out.println("Укажите кол-во элементов массива(четное положительное число, больше 0)");
        int n = scanner.nextInt();
        if ((n % 2 != 0) || (n <= 0)) {
            while ((n <= 0) || (n % 2 != 0)) {
                System.out.println("Кол-во элементов должно быть больше 0 и четным!!! Повторите попытку...");
                n = scanner.nextInt();
            }
        }
        int array[];
        array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = (int)(Math.random()*11 -5);
        }
        System.out.println("Создан массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n/2; i++){
            count1 = count1 + Math.abs(array[i]);
        }
        for (int i = n/2; i < n; i++){
            count2 = count2 + Math.abs(array[i]);
        }

        if (count1 > count2){
            System.out.println("Сумма модулей первой половины массива больше второй");
        } else if (count2 > count1){
            System.out.println("Сумма модулей второй половины массива больше первой");
        } else {
            System.out.println("Сумма модулей первой и второй половин массива равны");
        }

    }
}
