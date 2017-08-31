class Employee{
  private int id;
  String name;
  double sal;
  
  Employee(int id,String name,double sal){
  this.id=id;
  this.name=name;
  this.sal=sal;
  
  }
  public double getSalary()
  {
   return this.sal;
  }
}

class Labour extends Employee{

 
  private double overtime;
  Labour(int id,String name,double sal,double overtime){
		super(id,name,sal);
		this.overtime=overtime;
  
  
  }
  public double getSalary()
  {
   return this.overtime+super.getSalary();
  }

}

class Manager extends Employee{

  private double incentive;
  Manager(int id,String name,double sal,double incentive){
		super(id,name,sal);
		this.incentive=incentive;
  
  
  }
  public double getSalary()
  {
   return this.incentive+super.getSalary();
  }

}

class EmployeeTest{

 public static double getSalaryOfAllEmployees( Employee emp [])
 { 
 double totalSal=0.0;
  for(int i=0;i<emp.length;i++)
  {
     totalSal=totalSal+emp[i].getSalary();
   
  
  }
 return totalSal;
 }
 public static void main(String args[])
 {
   Employee e[]=new Employee[6];
   e[0]= new Labour(1,"peter",1000,200);
   e[1]=new Manager(2,"patrik",2000,300);
   e[2]=new Labour(3,"rock",3000,400);
   e[3]=new Manager(4,"john",4000,500);
   e[4]=new Labour(5,"ivan",5000,600);
   e[5]=new Manager(6,"reven",6000,700);
   double totalSal=getSalaryOfAllEmployees(e);
   System.out.println("Total Salary of all Employees : "+totalSal);
   
 
 
 }

}