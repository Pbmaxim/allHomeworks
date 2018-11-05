package Geomitrics;

import static java.lang.Math.sqrt;

public class TriangleSquarePerimeter {
    private int side1;
    private int side2;
    private int hypotenuce;
    private double square;
    private int perimeter;

    public TriangleSquarePerimeter() {
        this.hypotenuce = hypotenuce;
        this.side1 = side1;
        this.side2 = side2;
        this.square = square;
        this.perimeter = perimeter;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // нахождение первого катета на координатной плоскости

    public void setSide1(int X1, int Y1, int X2, int Y2) {
        this.side1 = side1;
        int point1;
        int point2;
        if ((X1 == X2) && (Y1 != Y2)) {
            if (Y1 > Y2) {
                side1 = Y1 - Y2;
            } else {
                side1 = Y2 - Y1;
            }

        }else if  ((X1 != X2) && (Y1 == Y2)) {
            if (X1 > X2) {
                side1 = X1 - X2;
            } else {
                side1 = X2 - X1;
            }
        }else {

            if (X1 > Y1) {
                point1 = X1 - Y1;
            } else {
                point1 = Y1 - X1;
            }
            if (X2 > Y2) {
                point2 = X2 - Y2;
            } else {
                point2 = Y2 - X2;
            }
            side1 = (int) sqrt(point1 * point1 + point2 * point2 );
        }

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // нахождение второго катета на координатной плоскости

    public void setSide2(int X1, int Y1, int X2, int Y2) {
        this.side2 = side2;
        int point1;
        int point2;

        if ((X1 == X2) && (Y1 != Y2)) {
            if (Y1 > Y2) {
                side2 = Y1 - Y2;
            } else {
                side2 = Y2 - Y1;
            }

        }else if  ((X1 != X2) && (Y1 == Y2)) {
            if (X1 > X2) {
                side2 = X1 - X2;
            } else {
                side2 = X2 - X1;
            }
        }else {

            if (X1 > Y1) {
                point1 = X1 - Y1;
            } else {
                point1 = Y1 - X1;
            }
            if (X2 > Y2) {
                point2 = X2 - Y2;
            } else {
                point2 = Y2 - X2;
            }
            side2 = (int) sqrt(point1 * point1 + point2 * point2);
        }


    }


    // вычисление гипотенузы
    public int getHypotenuce() {
        hypotenuce = (int) sqrt(side1 * side1 + side2 * side2);
        return hypotenuce;
    }

    public double getSquare() {
        square = (side1 * side2) / 2;
        return square;
    }

    public int getPerimeter() {
        perimeter = (side1 + side2 + getHypotenuce());
        return perimeter;
    }
}
