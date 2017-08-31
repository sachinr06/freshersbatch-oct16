import java.lang.reflect.*;
class NameOpr
{
 public String getCapName(String name){
 
 return name.toUpperCase();
 
 }
 
  public static String add(int i,String j)
                {
                                return (i+j);
                }
                


}


class Middleware{

  public static Object invokeMethod(String className,String method,Class []paramTypes,Object []params)
                {
                                try
                                {
                                                Class cls=Class.forName(className);
                                                Object obj=cls.newInstance();
                                                Method m=cls.getDeclaredMethod(method,paramTypes);
                                                return m.invoke(obj,params);
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                                return null;
                                }
                }
   


}




class MiddlewareTest{

                public static void main(String []args){
                                Class[] paramInt = new Class[1];
                                paramInt[0] = String.class;
                                String capital=(String)Middleware.invokeMethod("NameOpr","getCapName",paramInt,new Object[]{"Maha"});
                                System.out.println("Capital : " + capital);
                                
                                paramInt=new Class[2];
                                paramInt[0] = int.class;
                                paramInt[1] = String.class;
                                String sum=(String)Middleware.invokeMethod("NameOpr","add",paramInt,new Object[]{1,": Heet"});
                                System.out.println("sum: " + sum);
                                
                                
                }





}





















