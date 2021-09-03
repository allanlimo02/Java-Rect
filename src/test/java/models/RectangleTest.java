package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle rect = new Rectangle(2,4);
        assertEquals(true,rect instanceof Rectangle);
    }
    @Test
    public void newRectangle_getsLength_2() {
        Rectangle rect1 = new Rectangle(2, 4);
        assertEquals(2, rect1.getLength());
    }

    @Test
    public void newRectangle_getWidth() {
        Rectangle rect3 = new Rectangle(2,4);
        assertEquals(4,rect3.getWidth());
    }

    @Test
    public void isSquare_sidesEqual_true() {
        Rectangle rect3 = new Rectangle(2,2);
        assertEquals(true,rect3.isSquare());
    }
}