
function bankeg(Accno,Accbal)
{
	this.Accno=Accno;
	this.Accbal=Accbal;
	
}	
	bankeg.prototype.deposit=function(amt)
	{
		this.Accbal=this.Accbal+amt;
	}
	bankeg.prototype.withdraw=function(amt)
	{
		this.Accbal=this.Accbal-amt;
	}
	bankeg.prototype.getbal=function(amt)
	{
		document.write(" Balance :",this.Accbal);
	}		


function testaccount()
{
	var bk=new bankeg(1234,10000)
	bk.deposit(2000);
	bk.getbal();

}	
	