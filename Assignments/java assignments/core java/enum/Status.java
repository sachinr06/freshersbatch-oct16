public enum Status { 
NEW(0), REJECTED(1), ACCEPTED(2), COMPLETED(3);
private int value;  
private Status(int value){  
this.value=value;  
} 

public int getValue()
{
	
	return this.value;
	
}
 public String toString() { 
 switch(this) { 
   case NEW: System.out.println("STATUS:NEW"); break; 
    case REJECTED: System.out.println("STATUS:REJECTED"); break; 
	 case ACCEPTED: System.out.println("STATUS:ACCEPTED"); break; 
	  case COMPLETED: System.out.println("STATUS:COMPLETED"); break; 
   } 
   return "any";
   }
}







 class Order{

 int id;
 String name;
 Status status;
  
  Order(int id,String name,Status status)
  {
   this.id=id;
   this.name=name;
   this.status=status;
  
  
  }
  
  
  public int getId(){
	  return this.id;
	  
  }
    public String getName(){
	  return this.name;
	  
  }
  
  public Status getStatus()
  {
	  return this.status;
	  
  }

 

} 


