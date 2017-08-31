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
                                                Class cls=Class.forName(className); //loading class forcefully into memory  
                                                Object obj=cls.newInstance();//creating instance of the desired class 
                                                Method m=cls.getDeclaredMethod(method,paramTypes);//geting the required function 
                                                return m.invoke(obj,params); //returning the result of invoke() of  desired method  with the obj with parameters
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
                                Class[] paramInt = new Class[1];//no of parameters
                                paramInt[0] = String.class;//type of parameters 
                                String capital=(String)Middleware.invokeMethod("NameOpr","getCapName",paramInt,new Object[]{"sachin"});//method call
                                System.out.println("Capital : " + capital);
                                
                                paramInt=new Class[2];
                                paramInt[0] = int.class;
                                paramInt[1] = String.class;
                                String sum=(String)Middleware.invokeMethod("NameOpr","add",paramInt,new Object[]{1,": Sachin"});
                                System.out.println("sum: " + sum);
                                
                                
                }





}





















