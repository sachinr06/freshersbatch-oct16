interface Printable
{
  void print();
}


class Employee implements Printable{
  int id;
  String name;
  Employee(int id, String name){
  this.id=id;
  this.name=name;
  }
  
  public void print()
  {
   System.out.println("Employee id"+this.id+"Name"+this.name);
  }

}


class Circle implements Printable{
 int radius;
 Circle(int radius)
 {
 this.radius=radius;
 
 }
 public void print()
  {
   System.out.println("Circle has radius"+this.radius);
  }

}


class PrintableTest{
static void printAll( Printable p[])
{
 for(int i=0;i<p.length;i++)
     p[i].print();


}
public static void main(String args[])
{

  Printable p[]=new Printable[4];
  p[0]=new Circle(3);
  p[1]=new Employee(1,"Sachin");
  p[2]=new Circle(5);
  p[3]=new Employee(2,"Aniket");
  printAll(p);

}

}