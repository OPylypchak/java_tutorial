package ru.stqa.pft.sandbox;

import static java.lang.Math.sqrt;

/**
 * Created by Оля on 28.02.2016.
 */
public class Point {

  public double x;
  public double y;
  public double z;

public Point (double x, double y){
  this.x = x;
  this.y = y;
}

public double distance(Point p2){
  return sqrt((p2.x - x)*(p2.x - x)+(p2.y - y)*(p2.y - y));
}

}
