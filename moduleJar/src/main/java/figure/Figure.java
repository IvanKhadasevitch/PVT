package figure;

public class Figure {

    public double getCircleArea(double r) {
        return Math.PI * r;
    }

    public double getCirclePerim(double r) {
        return r * 2 * Math.PI;//fdgdfh
    }

    public double getAreaTriangle(double lengthA, double lengthB, double lengthC) {

        return Math.sqrt((lengthA + lengthB + lengthC) / 2)
                * ((-lengthA + lengthB + lengthC) / 2)
                * ((lengthA - lengthB + lengthC) / 2)
                * ((lengthA + lengthB - lengthC) / 2);
    }

    public double getPerimeterTriangle(double lengthA, double lengthB, double lengthC) {
        return lengthA + lengthB + lengthC;
    }
}
