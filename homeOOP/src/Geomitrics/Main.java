package Geomitrics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // окружность
        System.out.println("Введите координаты первой точки радиуса круга");
        int rx1 = scanner.nextInt();
        int ry1 = scanner.nextInt();
        System.out.println("Введите координаты второй точки радиуса круга");
        int rx2 = scanner.nextInt();
        int ry2 = scanner.nextInt();
        CircleLength circleLength = new CircleLength();
        circleLength.setRadius(rx1, ry1, rx2, ry2);
        System.out.println("Длина (периметр) окружности = " + circleLength.getPerimeter());

    // прямоугольник:
        RectangleSquarePerimeter rectangleSquarePerimeter = new RectangleSquarePerimeter();
        System.out.println("Введите координаты первой точки первой стороны прямоугольника");
        int AX = scanner.nextInt();
        int AY = scanner.nextInt();
        System.out.println("Введите координаты второй точки первой стороны прямоугольника");
        int BX = scanner.nextInt();
        int BY = scanner.nextInt();
        rectangleSquarePerimeter.setSide1(AX, AY, BX, BY);
        System.out.println("Введите координаты первой точки второй стороны прямоугольника");
        AX = scanner.nextInt();
        AY = scanner.nextInt();
        System.out.println("Введите координаты второй точки второй стороны прямоугольника");
        BX = scanner.nextInt();
        BY = scanner.nextInt();
        rectangleSquarePerimeter.setSide2(AX, AY, BX, BY);
        System.out.println("Площадь прямоугольника = " + rectangleSquarePerimeter.getSquare() + " " +
                "Периметр прямоугольника = " + rectangleSquarePerimeter.getPerimeter());

    // треугольник
        TriangleSquarePerimeter triangleSquarePerimeter = new TriangleSquarePerimeter();
        System.out.println("Введите координаты первой точки первого катета");
        AX = scanner.nextInt();
        AY = scanner.nextInt();
        System.out.println("Введите координаты второй точки первого катета");
        BX = scanner.nextInt();
        BY = scanner.nextInt();
        triangleSquarePerimeter.setSide1(AX, AY, BX, BY);
        System.out.println("Введите координаты первой точки второго катета");
        AX = scanner.nextInt();
        AY = scanner.nextInt();
        System.out.println("Введите координаты второй точки второго катета");
        BX = scanner.nextInt();
        BY = scanner.nextInt();
        triangleSquarePerimeter.setSide2(AX, AY, BX, BY);
        System.out.println("Площадь треугольника = " + triangleSquarePerimeter.getSquare() + " " +
                "Периметр треугольника = " + triangleSquarePerimeter.getPerimeter());




    }
}
