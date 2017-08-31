import java.lang.reflect.*; //import reflection package
public class Reflect3Test
{
	public static void main(String args[])throws Exception
	{
		String defstr="Shravya";
		int defint=3;
		double defdouble=4.5;

		Class c = Class.forName(args[0]); //loads the class forcefully into memory
		Constructor con[] = c.getConstructors(); //returns all constructors of class
		System.out.println("Length of con:"+con.length);
		for(int i=0;i<con.length;i++)
		{
					Class[] parameterTypes = con[i].getParameterTypes(); 
					System.out.println("");
					for(Class parameterType: parameterTypes)
					{
					 
			         System.out.print(parameterType.getName());
			        }  
		}
		Object obj=con[1].newInstance(defint,defint,defint);
		System.out.println("obj:"+obj);
	}
}