
function calc()
{
	var st=document.getElementById("str1").value;
	var n=st.length;
	var count=0;
	for(i=1;i<=n;i++)
	{
	
	count++;
		
	}
	
	document.write(" Number of characters=",count);
	document.write("<br><br>");
	var count2=0;
	
	for(i=1;i<=n;i++)
	{
	if(st[i]==" ")
	{
	}		
	else
	count2++;
		
	}
	
	document.write(" Number of characters excluding white spaces=",count2);
}