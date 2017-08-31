package SpringAOPProject.SpringAOP;

import java.util.*;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class StringAspect {
	List<Throwable> execp=new ArrayList<Throwable>();
    @Pointcut("execution(* StringOperations.getStrLenght(..))")  
	public void parameter_pointcut(){}
      
	/*@Before("parameter_pointcut()")
    public void beforeLength(JoinPoint jp)
	//it is advice (before advice)       
	{        
		Object args[] = jp.getArgs();  
		System.out.println("THE STRING ARGUMENT: " +args[0]); ;   
	} 
	
	@AfterThrowing(pointcut="parameter_pointcut()",throwing= "error")
    public void afterLength(JoinPoint jp,String error)
	//it is advice (before advice)       
	{     
		//System.out.println("Exception : " + error);
		execp.add(error);
	} 
	*/
    @Around("parameter_pointcut()")
    public void aroundLength(ProceedingJoinPoint jp) throws Throwable  {
    	Object args[] = jp.getArgs();  
		System.out.println("THE STRING ARGUMENT: " +args[0]); 
		String op=(String)args[0];
		jp.proceed();
			
		
	

    }

	 @Pointcut("execution(* StringOperations.getCapStr(..))")  
		public void parameter_pointcut2(){}
	   @Around("parameter_pointcut2()")
	    public void aroundcap(ProceedingJoinPoint jp) throws Throwable  {
	    	Object args[] = jp.getArgs();  
			System.out.println("THE STRING ARGUMENT: " +args[0]); 
			String op=(String)args[0];
			jp.proceed();
				
	   }
		
		 @Pointcut("execution(* StringOperations.getCapStr(..))")  
			public void parameter_pointcut3(){}
		      
		 @Around("parameter_pointcut3()")
		    public void aroundlow(ProceedingJoinPoint jp) throws Throwable  {
		    	Object args[] = jp.getArgs();  
				System.out.println("THE STRING ARGUMENT: " +args[0]); 
				String op=(String)args[0];
				jp.proceed();
					
		   }
		
		 
	} 
	
	

	
