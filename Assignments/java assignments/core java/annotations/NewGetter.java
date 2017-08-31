package com.training.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.METHOD})

public @interface Getter {


}


public class NewGetter{
	
public static void main(String args[]) throws Exception{

    Class cls=Class.forName("Employee");
    Method m[]=cls.getDeclaredMethods();

    for(int i=0;i<m.length;i++)
	Getter manno[]=m[i].getAnnotation(Getter.class);
  
    
}
}