package figure;

public class Figure {

    public double getCircleArea(double r) {
        return Math.PI * r;
    }

    public double getCirclePerim(double r) {
        return r * 2 * Math.PI;
    }

    public double getAreaTriangle(int lengthA, int lengthB, int lengthC) {

        return Math.sqrt((lengthA + lengthB + lengthC) / 2)
                * ((-lengthA + lengthB + lengthC) / 2)
                * ((lengthA - lengthB + lengthC) / 2)
                * ((lengthA + lengthB - lengthC) / 2);
    }

    public double getPerimeterTriangle(int lengthA, int lengthB, int lengthC) {
        return lengthA + lengthB + lengthC;
    }
}
