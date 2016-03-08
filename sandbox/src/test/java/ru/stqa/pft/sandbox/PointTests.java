package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Оля on 08.03.2016.
 */
public class PointTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(1, 2);

    Assert.assertEquals(p1.distance(p2),5.656854249492381);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(1, 2);

    assert p2.distance(p1) > 5.64;
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(1, 2);

    assert p2.distance(p1) < 5.66;
  }

}