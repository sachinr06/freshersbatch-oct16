
function calc()
{
	var str=document.getElementById("str1").value;
	var splitString = str.split("");
	 var reverseArray = splitString.reverse();
	  var rev= reverseArray.join("");
	//var rev=st.reverse();
	 if(str==rev)
	 {
		 alert("string is pallindrome");
	 }
	 else
		 {
		 alert("string is not pallindrome");
	 }
	//document.write(" Number of vowels=",count);
}