abstract class Persistence{
   abstract void persist();

}

class FilePersistence extends Persistence{
 public void persist(){
 System.out.println("data persists in File");
 }
}

class DatabasePersistence extends Persistence{
 public void persist(){
 System.out.println("data persists in Database");
 }
}

class PersistenceFactory{
	
	public static Persistence getPersistence()
	{
		DatabasePersistence d=new DatabasePersistence();
		return d;
		
	}
	
}



class PersistenceTest{
public static void main(String args[])
{
 Persistence P=PersistenceFactory.getPersistence();
 P.persist();
}

}