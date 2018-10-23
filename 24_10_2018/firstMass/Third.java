/*Задача 3
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
*/
package firstMass;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        byte count = 0;
        int array[];
        array = new int[15];
        for (int i = 0; i < 15; i++){
            array[i] = (int)(Math.random()* 10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 15; i++){
            if (array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Количество четных элементов массива = " + count);
    }
}
