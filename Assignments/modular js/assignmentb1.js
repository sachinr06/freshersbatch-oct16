var BankAccount ={
			AccNo:1234,
			Accbal:1000,
			Accname:"Sachin",
			withdraw: function(amt)
			 {
			    if(amt < this.Accbal)
				    this.Accbal=this.Accbal-amt;
					else
				  document.write("<br> Not enough balance<br>");
			      
		    },

         	deposit:function (amt)
          {
		     this.Accbal=this.Accbal+amt;
          
          },
            getbal : function()
		   {
			   document.write("<br> Balance now is <br> ", this.Accbal);
		   }
               		   
		
	 };
			 
			 
			 
      function testaccount()
	  {
		  BankAccount.withdraw(1200);
		  BankAccount.getbal();
	  }
	  