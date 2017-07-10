
   
    while(1){
	    var a=prompt(" Enter a number or type 'quit' to exit ");
		if(a=='quit')
		{
			break;
		}
		document.write("  Multiplication table : ", a);
	     for(i=1;i<=10;i++)
		 {
			 document.write("<br>" ,a*i);
		 }
		 document.write("<br><br>");
}	
	

// document.getElementById("y2").innerHTML="The Birth Year is", +y;
     
	
	