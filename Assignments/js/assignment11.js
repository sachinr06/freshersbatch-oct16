
function calc()
{
	var st=document.getElementById("str1").value;
	var n=st.length;
	var count=0;
	for(i=1;i<=n;i++)
	{
		x=st[i];
		if((x==='a')||(x==='e')||(x==='i')||(x==='o')||(x==='u')||(x==='A')||(x==='E')||(x==='I')||(x==='O')||(x==='U'))
{
	count++;
}
		
	}
	
	document.write(" Number of vowels=",count);
}