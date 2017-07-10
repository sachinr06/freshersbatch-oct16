
function login()
{

    
	  var x=document.getElementById("uname").value;
	  var y=document.getElementById("pwd").value;
	  var n=0;
	while(n<=2)
	{
		n=n+1;
		if((x=='sachin')&&(y=='sachin'))
		{
			alert("Login Success");
			return;
		}
		
		else
		{
			alert(" Wrong Username or Password");
			x=prompt("Reenter user name");
			y=prompt("Reenter Password");
			
		     
	}	
    }
	alert(" Exceded the Maximum Number of Chances");

}