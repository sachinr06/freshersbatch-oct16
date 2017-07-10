
function fact()
{

      var f=1;
	  var x=document.getElementById("num1").value;
	  for(i=1;i<=x;i++)
	  {
		  f=f*i;
	  }
document.write(" Factorial of ",x);
document.write(" is", f);	  


}