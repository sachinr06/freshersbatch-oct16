
function bankeg(_Accno,_Accbal)
{
	var Accno=_Accno;
    var Accbal=_Accbal;
	
	
	return {
		  deposit(amt)
		  {
			Accbal=Accbal+amt;
		  },
		  withdraw(amt)
		 {
			Accbal=Accbal-amt;
		 },
			getbal:function(amt)
			{
			document.write(" Balance :",Accbal);
			}
	};
}

function testaccount()
{
	var bk=new bankeg(1234,10000);
	bk.deposit(2000);
	bk.withdraw(3000);
	bk.getbal();

}	
	