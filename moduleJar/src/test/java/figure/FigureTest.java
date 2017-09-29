package figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {
    private Figure figure = new Figure();
    private double r = 5;
    private double lengthA, lengthB;
    private double lengthC = lengthA = lengthB = 1;
    @Test
    public void getCircleAreaTest(){
        double area = figure.getCircleArea(r);
        assertEquals(area, Math.PI*r);
    }
    @Test
    public void getCirclePerimTest(){
        double perim = figure.getCirclePerim(r);
        assertEquals(perim, Math.PI*r*2);
    }
    @Test
    public void getAreaTriangle(){
        double areaTriangle = figure.getAreaTriangle(lengthA, lengthB, lengthC);
        double areaTriangleCheck = (Math.sqrt(3.0) / 4) * Math.pow(lengthA, 2.0);
        assertEquals(areaTriangle, areaTriangleCheck);
    }
    @Test
    public void getPerimeterTriangle() {
        double perimeterTriangle = figure.getPerimeterTriangle(lengthA, lengthB, lengthC);
        assertEquals(perimeterTriangle, 1 + 1 + 1);
    }
}
