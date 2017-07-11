var BankAccount ={
			AccNo:0,
			Accbal:0,
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
		 var bk=Object.create(BankAccount);
		 bk.AccNo=1234;
		 bk.Accbal=10000;
		 bk.deposit(2000);
		 bk.getbal();
		 
	  }
	  