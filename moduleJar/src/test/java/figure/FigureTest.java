package figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {
    Figure circle = new Figure();
    double r = 5;
    @Test
    public void getCircleAreaTest(){
        double area = circle.getCircleArea(r);
        assertEquals(area, Math.PI*r);
    }
    @Test
    public void getCirclePerimTest(){
        double perim = circle.getCirclePerim(r);
        assertEquals(perim, Math.PI*r*2);
    }
}
