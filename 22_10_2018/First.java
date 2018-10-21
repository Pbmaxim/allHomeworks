/*Задача 1*
В три переменные a, b и c явно записаны программистом
три целых попарно неравных между собой числа.
Создать программу, которая переставит числа в переменных таким образом,
чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
*/

import java.util.Scanner;
 public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите три целых попарно неравных между собой числа");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if ( (a < b) && (a < c) ){
            System.out.println(a);
            if (b <= c){
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        }else if ((b < a) && (b < c)) {
            System.out.println(b);
            if (a <= c){
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else if ( (c < a) && (c < b)){
            System.out.println(c);
            if (b <= a){
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }

    }
}

