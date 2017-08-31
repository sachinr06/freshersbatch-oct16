//package com.training.annotations;
import java.lang.reflect.*;




public class NewGetter2 {
	
	

	public static void main(String[] args) throws Exception {


			    Class cls=Class.forName("Employee");
			    Method methods[]=cls.getDeclaredMethods();
					Field messageFields[] = cls.getDeclaredFields(); 
			    for(Method method:methods)
			    {
				 Getter manno=method.getAnnotation(Getter.class);
				 
				// System.out.println(method);
				 if(manno!=null)
				 {
					 
					 StringBuilder methodName=new StringBuilder(method.getName());
					 System.out.println(methodName);
					  String sb=methodName.substring(0,3);
					   String sb2=methodName.substring(3,methodName.length());
					  // System.out.println(sb);
					 // System.out.println(sb2);
					sb2=sb2.toLowerCase();
					//System.out.println(sb2);
					if(sb.equals("get"))
					{
							
					try{
					Field f = cls.getDeclaredField(sb2);
						 
					//System.out.println(f);
					
					StringBuilder fieldName=new StringBuilder(f.getName());
					
									Type retType = method.getReturnType();
									Type fieldType = f.getType();
									//System.out.println(fieldName);
									if(retType==fieldType)
									{
										System.out.println("Success");
									}
									else{
										System.out.println("Error in the Method");
									}
									
					}
					catch(Exception e)
					{
						System.out.println("Error in the Method");
						
						
					}
							  
					             
				 }
				 else{
					 
						System.out.println("Error in the Method");
					 
				 }
					 
				 }
				 
				 
				 
				 else{
					 
					 
					 
					
						System.out.println("Error in the Method"); 
					 
				 }
				 
				 
				 System.out.println("-----------------------"); 
				 }
			   
			    
	}
	
	}


