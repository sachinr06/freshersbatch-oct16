
function bankeg(Accno,Accbal)
{
	this.Accno=Accno;
	this.Accbal=Accbal;
	this.deposit=function(amt)
	{
		this.Accbal=this.Accbal+amt;
	}
	this.withdraw=function(amt)
	{
		this.Accbal=this.Accbal-amt;
	}
	this.getbal=function(amt)
	{
		document.write(" Balance :",this.Accbal);
	}		
}


function testaccount()
{
	var bk=new bankeg(1234,10000)
	bk.deposit(2000);
	bk.getbal();

}	
	