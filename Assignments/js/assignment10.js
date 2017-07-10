
var ary=[45,67,34,21,9];
document.write("Given Array<br>");
for( var i = 0; i < ary.length; i++ ){
    document.write("<br>", parseInt( ary[i], 10 )); //don't forget to add the base
}

 document.write("<br><br>");
var type=prompt(" Enter ASC for Ascending DSC for descending");

if(type=='ASC')
{
	document.write(" Ascending Sort <br><br>");
ary1=ary.sort(function(a,b) { return a - b; });

for( var i = 0; i < ary1.length; i++ ){
    document.write("<br>", parseInt( ary1[i], 10 )); //don't forget to add the base
}
}
else
if(type=='DSC')
{
	document.write(" Descending Sort <br><br>");
ary2=ary.sort(function(a,b) { return b - a; });

for( var i = 0; i < ary2.length; i++ ){
    document.write("<br>", parseInt( ary2[i], 10 )); //don't forget to add the base
}
}