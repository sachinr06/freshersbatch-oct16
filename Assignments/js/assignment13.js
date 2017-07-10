
/* function calc()
{
	var st=document.getElementById("str1").value;
	var n=st.length;
	var count=0;
	for(i=1;i<=n;i++)
	{
	  if(st[i]=='@')
	  {
		  count++;
	     for(j=i;j<=n;j++)
		  {
		  if(st[j]=='.')
		  count++;
		  }
		  if(count==1)
			alert("inValid email address");
		   else if (count==2)
			   alert("Valid email address");
	  }
	}
	
} */
function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}