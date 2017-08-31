abstract class Persistence{
   abstract void persist();

}

class Point extends Shape{
 public void draw(){
 System.out.println("Drawing a Point");
 }
}

class Circle extends Point {
 public void draw(){
 System.out.println("Drawing a Circle");
 }

}

class Line extends Shape{
 public void draw(){
 System.out.println("Drawing a Line");
 }
}

class Rectangle extends Line{
 public void draw(){
 System.out.println("Drawing a Rectangle");
 }


}


class ShapeTest{
public static void main(String args[])
{
  Shape s[]=new Shape[4];
   s[0]=new Point();
   s[1]=new Circle();
   s[2]=new Line();
   s[3]=new Rectangle();
   for( int i=0;i<s.length;i++)
        s[i].draw();
}

}