


public class EnumTest{
public static void main(String args[])
{
 Status status=Status.NEW;
Order o=new Order(1,"Hi",status);
System.out.println("ID : "+o.getId());
System.out.println("NAME : "+o.getName());
System.out.println("STATUS: "+o.getStatus());
int value=status.getValue();
System.out.println("Value : "+value);

}

}