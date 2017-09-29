package figure;

public class Figure {


    public double getRectArea(int a, int b) {
        return a * b;
    }

    public double getRectPerim(int a, int b) {
        return 2 * a + 2 * b;
    }

    public double getCircleArea(double r) {
        return Math.PI * r;
    }

    public double getCirclePerim(double r) {
        return r * 2 * Math.PI;
    }

    public double getAreaTriangle(double lengthA, double lengthB, double lengthC) {
        System.out.println("This is getAreaTriangle");
        double halvePerimeter = this.getPerimeterTriangle(lengthA, lengthB, lengthC) / 2;
        return Math.sqrt(halvePerimeter *
                (halvePerimeter - lengthA) *
                (halvePerimeter - lengthB) *
                (halvePerimeter - lengthC));
    }

    public double getPerimeterTriangle(double lengthA, double lengthB, double lengthC) {
        System.out.println("This is getPerimeterTriangle");
        return lengthA + lengthB + lengthC;
    }
}
