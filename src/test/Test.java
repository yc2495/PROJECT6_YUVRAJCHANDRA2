package bsu.comp152;

import java.awt.*;



public class RectangleTest {
  # one test for error
  # one test might be to test a rectangle against itself.
            # one nowhere near
  # one regular overlap

  # test for incorrect code
    @Test
    public void testError() {
        Rectangle r1 = new Rectangle(3, 5, 8, 2);
        Rectangle r2 = new Rectangle(7, 10, 8, 3);
        assertEquals(true, r1.incorrectDoHit(r2))
    }

    @Test
    public void testSelf() {
        Rectangle r1 = new Rectangle(3, 5, 8, 2);
        assertEquals(true, r1.doHit(r1))
    }

    @Test
    public void testFar() {
        Rectangle r1 = new Rectangle(1, 10, 2, 1);
        Rectangle r2 = new Rectangle(9, 10, 10, 1);
        assertEquals(false, r1.doHit(r2))
    }

    @Test
    public void testOverlap() {
        Rectangle r1 = new Rectangle(3, 5, 8, 2);
        Rectangle r2 = new Rectangle(7, 10, 8, 3);
        assertEquals(true, r1.doHit(r2))
    }
