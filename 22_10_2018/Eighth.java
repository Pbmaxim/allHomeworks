/*Задача 8*
Есть три вершины X, Y, Z.
Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа.
Нужно определить - является ли треугольник с заданными координатами прямоугольным.
*/
import java.util.Scanner;
public class Eighth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, y1, y2, z1, z2;
        double X, Y, Z;

        System.out.println("Введите координаты точки X");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();

        X = Math.sqrt(x1*x1 + x2*x2);

        System.out.println("Введите координаты точки Y");
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();

        Y = Math.sqrt(y1*y1 + y2*y2);

        System.out.println("Введите координаты точки Z");
        z1 = scanner.nextInt();
        z2 = scanner.nextInt();

        Z = Math.sqrt(z1*z1 + z2*z2);


        if ( X*X == (Y*Y + Z*Z) ){
            System.out.println("Угол между катетами Y и Z прямой");
        }else if ( Y*Y == (X*X + Z*Z) ) {
            System.out.println("Угол между катетами X и Z прямой");
        }else if ( Z*Z == (Y*Y + X*X) ){
            System.out.println("Угол между катетами Y и X прямой");
        }else {
            System.out.println("В данном треугольнике нет прямого угла");
        }

    }
}
