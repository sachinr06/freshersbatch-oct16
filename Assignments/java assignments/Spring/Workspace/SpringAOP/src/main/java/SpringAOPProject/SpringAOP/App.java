package SpringAOPProject.SpringAOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	//HashMap<String,Exception> exe=new HashMap<String,Exception>();
    	AbstractApplicationContext iocContainer=new ClassPathXmlApplicationContext("beans_aops.xml");
    	
    	
    	
    /*	StringOperations str = (StringOperations) iocContainer.getBean("strBean");
    try{
    	int length=str.getStrLenght("sa");
		System.out.println("lenght = "+length);
    }
    catch(Exception e){
    	exe.put("getStrLenght()",e);
    }
    	
   
    
    try{
    	String upper=str.getCapStr(null);
    	System.out.println("uppercase = "+upper);
    }
    catch(Exception e){
    	exe.put("getStrCap()",e);
    }
    
    
    try{
    	String lower=str.getLowStr("sachin");
    	System.out.println("lowercase = "+lower);
    }
    catch(Exception e){
    	exe.put("getLowCap()",e);
    }
    	
    	
    	Set<String> a=exe.keySet();
    	for(String avb:a){
    		System.out.println("METHOD : "+avb+" Exception: "+exe.get(avb) );
    	}*/
    	
    	
    	
    	
    /*	TimeTest t=(TimeTest) iocContainer.getBean("timeBean");
    	t.addInList();
    	t.addInVector();*/
    	
    	int choice;
    	char again;
    	Scanner sc=new Scanner(System.in);
    	
    	 User u = (User) iocContainer.getBean("userBean");
    	do{
    		System.out.println("1. REGISTER");
    		System.out.println("2. LOGIN");
    		System.out.println("3. LOGOUT");
    		choice= sc.nextInt();
    	 switch(choice){
    
    	case 1: System.out.println("register");
    	
    	String uname=sc.next();
    	String password=sc.next();
    	String fname=sc.next();
    	String country=sc.next();
    
    	u.register(uname, password, fname, country);
    
    	break;
    	
    	case 2:
    		System.out.println("Login");
        	
        	String uname2=sc.next();
        	String password2=sc.next();
        
        	u.login(uname2,password2);
        
        	System.out.println(" 1. WORK ");
        	System.out.println(" 2. LOGOUT ");
        	choice= sc.nextInt();
        	switch(choice){
        	case 1:  System.out.println("DO YOU WANT TO CONTINUE ?");
        	case 2: u.logout(uname2,password2);
        	}
        	break;
        	
        	
    	case 3:
    		System.out.println("Logout");
    		
    		
    	}
    	 System.out.println("DO YOU WANT TO CONTINUE ?");
    	again= sc.next().charAt(0);
    	}while(again=='y');
    }
}