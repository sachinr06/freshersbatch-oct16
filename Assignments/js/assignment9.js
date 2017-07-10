
var ary=[45,67,34,21,9];
var max1=Math.max.apply(null, ary);
var min1=Math.min.apply(null, ary);
//var avg1=Math.average.apply(Math, ary);
var sum = 0;
for( var i = 0; i < ary.length; i++ ){
    sum += parseInt( ary[i], 10 ); //don't forget to add the base
}

var avg = sum/ary.length;



document.write("<br>Maximum is  ",max1);
document.write("<br>Minimum is  ",min1);
document.write("<br>Average is", avg);
document.write("<br>Total is", sum);
