package edu.macalester.comp127.hw0;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class AreaTest {
    @Test
    public void testSquare() {
        assertEquals(9.0, Area.getSquareArea(3.0), 0.001);
    }

    @Test
    public void testCircle() {
        assertEquals(28.2743, Area.getCircleArea(3.0), 0.001);
    }
}
