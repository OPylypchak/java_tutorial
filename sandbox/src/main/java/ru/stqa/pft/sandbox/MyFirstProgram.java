package ru.stqa.pft.sandbox;

import com.sun.org.apache.regexp.internal.RE;

import static java.lang.Math.*;

public class MyFirstProgram {

 public static void main(String[] args) {

   double x1 = 5;
   double y1 = 6;
   double x2 = 1;
   double y2 = 2;

   Point p1 = new Point(x1, y1);
   Point p2 = new Point(x2, y2);

  System.out.println("Расстояние между точками p1(" + x1 + "; " + y1 + ") и p2 (" + x2 + "; " + y2 + ") = " + distance(p1, p2));

  /*Square s = new Square(5);
  System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

  Rectangle r = new Rectangle(4, 6);
  System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());*/

 }

  private static double distance(Point p1, Point p2){
    return sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y -p1.y)*(p2.y - p1.y));
  }
}