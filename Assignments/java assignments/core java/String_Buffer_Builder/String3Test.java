import java.util.*;
class String3Test{

public static void main(String args[])
{
	StringBuffer str=new StringBuffer(" Welcome to java ");

		for(int i=0;;i++)
		{
		String str2=str.substring(1,str.length());
		StringBuffer buff = new StringBuffer(str2);
		String str3=str.substring(0,1);
		StringBuffer buff2 = new StringBuffer(str3);
		//System.out.println(buff);
		//	System.out.println(buff2);
		buff.append(buff2);
		str=buff;
		System.out.print(str+"\r");
		try {
         Thread.sleep(100);
      } catch (Exception x) {
         System.out.println("Caught it" + x);
      }
		
		}

	
	
}


}