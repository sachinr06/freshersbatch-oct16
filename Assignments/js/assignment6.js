
function prime()
{

 
	  var x=document.getElementById("num1").value;
	  var y=document.getElementById("num2").value;
	  var count=0;
	  if(x>=y)
	  {
		  document.write("all prime numbers between ", y ," and ", x ," are :");
		for(i=y;i<=x;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
			  if(i%j==0)
			    count++;				  
			}	
			
			if(count==2)
			{
				 
				document.write(" ",i);
			}
		}
 
}

if(y>=x)
	  {
		  document.write("all prime numbers between", x ,"and", y ,"are :");
		for(i=x;i<=y;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
			  if(i%j==0)
			    count++;				  
			}	
			
			if(count==2)
			{
				 
				document.write(" ",i);
			}
		}
 
}
}