import java.lang.reflect.*;
class SampleOpr
{
  public String join(String s1,String s2){
	  
	  
	  s1=s1.concat(s2);
	  return s1;
	  
  }



}



class MiddleWare2
{
   public static Object invokeMethod(String className,String methodName,Class paramTypes[],Object params[])
   {
	   try{
		   
	   Class c=Class.forName(className);
	   Object obj=c.newInstance();
	   Method m=c.getDeclaredMethod(methodName,paramTypes);
	   return m.invoke(obj,params);
	   }
	   
	   
	   catch(Exception e)
	   {
		   
		   
			return null;
		   
	   }
	   
	   
	   
	   
   }
 




}



class MiddleWareTest2{


public static void main(String args[])
{
  Class paramCount[]=new Class[2];	
  paramCount[0]=String.class;
  paramCount[1]=String.class;
  String joined=(String)MiddleWare2.invokeMethod("SampleOpr","join",paramCount, new Object[]{"Hello "," World"});
	System.out.println("Joined String : "+joined);
	
}	
	
	






}