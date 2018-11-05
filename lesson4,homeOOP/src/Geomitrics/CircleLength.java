package Geomitrics;

import static java.lang.Math.sqrt;

public class CircleLength {
    private double perimeter;
    private double radius;
    private int point1;
    private int point2;

    public CircleLength() {
        this.perimeter = perimeter;
        this.radius = radius;
    }



    public void setRadius(int X1, int Y1, int X2, int Y2) {

        if (X1 > Y1){
            point1 = X1 - Y1;
        } else {
            point1 = Y1 - X1;
        }

        if (X2 > Y2){
            point2 = X2 - Y2;
        } else {
            point2 = Y2 - X2;
        }

        radius = (int) sqrt(point1^2 + point2^2);
        this.radius = radius;
    }


    public double getPerimeter() {
        perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

}
