import java.lang.reflect.*; 
class ReflectTest{

public static void main(String args[]) throws ClassNotFoundException
{

Class c = Class.forName(args[0]);
Constructor con[] = c.getDeclaredConstructors(); 
Method m[] = c.getDeclaredMethods();
Field f[] = c.getDeclaredFields();
for(int i=0;i<con.length;i++)
System.out.println(con[i]);
for(int i=0;i<m.length;i++)
System.out.println(m[i]);
for(int i=0;i<f.length;i++)
System.out.println(f[i]);

}
}