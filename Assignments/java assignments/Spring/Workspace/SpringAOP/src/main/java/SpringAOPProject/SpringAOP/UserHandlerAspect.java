package SpringAOPProject.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserHandlerAspect {
	long startTime=0;
	  @Pointcut("execution(* User.register(..))")  
			public void parameter_pointcut(){}
	  
	  
	  @Around("parameter_pointcut()")
	    public void aroundregister(ProceedingJoinPoint jp) throws Throwable   {

		  Object args[] = jp.getArgs();
		  String uname=(String) args[0];
		  String password=(String) args[1];
		  if(uname.length()<3 || password.length()<3){
			  throw new Exception("MINIMUM REQUIREMENTS NOT SATISFIED");
		  }
		  else{
			  
				jp.proceed();
				
		  }
	    }
	  
	  
	  @Pointcut("execution(* User.login(..))")  
		public void parameter_pointcut2(){}


@Around("parameter_pointcut2()")
  public void aroundlogin(ProceedingJoinPoint jp) throws Throwable   {

	  Object args[] = jp.getArgs();
	  String uname=(String) args[0];
	  String password=(String) args[1];
	  if(uname.length()<3 || password.length()<3){
		  throw new Exception("MINIMUM REQUIREMENTS NOT SATISFIED");
	  }
	  else{
		  startTime = System.currentTimeMillis();
			jp.proceed();
		
	  }
  }


@Pointcut("execution(* User.logout(..))")  
public void parameter_pointcut3(){}


@Around("parameter_pointcut3()")
public void aroundlogout(ProceedingJoinPoint jp) throws Throwable   {
	
	if(startTime==0){
		 throw new Exception("NOT LOGGED IN");
	}
	else{
		jp.proceed();
		long endTime= System.currentTimeMillis();
		long session =endTime-startTime;
		System.out.println("SESSION  "+session);
	}

}
		  
}
