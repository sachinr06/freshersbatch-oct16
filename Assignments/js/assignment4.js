
function mul()
{

 do{
	  var x=document.getElementById("num").value;
 var w=0;
	 for(i=1;i<=10;i++)
	 {
	 w=x*i
     document.write("<br>",w);
	 }
	var ask=confirm("Do you want to Continue ");
	if(ask==true)
	{
		num=num+1;
	}
	else
	{
       break;		
	}
	}while(ask==true)
}	
	
//var A = document.getElementById("age").value;
// var y = "2017"-A;
// result.innerHTML = "<marquee>"+"welcome "+"<font color = 'red'>"+textField+"</font>"+" how are you?"+"</marquee>";

// document.getElementById("y2").innerHTML="The Birth Year is", +y;
     
	
	