package ru.stqa.pft.sandbox;

import com.sun.org.apache.regexp.internal.RE;

import static java.lang.Math.*;

public class MyFirstProgram {

 public static void main(String[] args) {

   Point p1 = new Point(5, 6);
   Point p2 = new Point(1, 2);




  System.out.println("Расстояние между точками p1(" + p1.x + "; " + p1.y + ") и p2 (" + p2.x + "; " + p2.y + ") = " + p1.distance(p2));

  /*Square s = new Square(5);
  System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

  Rectangle r = new Rectangle(4, 6);
  System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());*/

 }

  /*public static double distance(Point p1, Point p2){
    return sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y -p1.y)*(p2.y - p1.y));
  }*/
}