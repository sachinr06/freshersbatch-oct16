var Employee = 
{
	empid:0,
	empname:"Unknown",
	empsalary:0,
	deptno:0,
	
	getempid:function() 
	{
		
		return this.empid;
	},
    
	getempname:function()
	{
		 return this.empname;
		
	},
    
	getempsalary:function()
	{    
	   return this.empsalary;
		
	},

	getempdept:function()
	{
		 return this.deptno;
		
	}

	
};



var Employeelist= (function() { 
var emps = []; 
return {
        addemployee:function(emp){ emps.push(emp);},
	    
		
		
		esort: function(){
		                   ary1=emps.sort(function(a,b) { return a.getempid() - b.getempid(); })},
			  
			getemps: function(){ return ary1;}
       }
   })();
   
   
   
   
   
  function testemp()
  {
    var emp1=Object.create(Employee);
	emp1.empid=106;
	emp1.empname="Harry"
	emp1.salary=20000;
	emp1.deptno=1;
	emp1.getempid();
	emp1.getempname();
	emp1.getempsalary();
	emp1.getempdept();
	Employeelist.addemployee(emp1);
	
	 var emp2=Object.create(Employee);
	emp2.empid=102;
	emp2.empname="Sally"
	emp2.salary=30000;
	emp2.deptno=2;
	emp2.getempid();
	emp2.getempname();
	emp2.getempsalary();
	emp2.getempdept();
	Employeelist.addemployee(emp2);
	
	var emp3=Object.create(Employee);
	emp3.empid=108;
	emp3.empname="Mita"
	emp3.salary=25000;
	emp3.deptno=1
	emp3.getempid();
	emp3.getempname();
	emp3.getempsalary();
	emp3.getempdept();
	Employeelist.addemployee(emp3);
	
    Employeelist.esort();
	list=Employeelist.getemps();
	for (i in list)
	{
        list[i].getempid();
        document.write(" <br>ID=",list[i].getempid());
		document.write(" <br>NAME =",list[i].getempname());
		document.write("<br> DEPT =",list[i].getempdept());
		document.write(" <br>SALARY =",list[i].getempsalary());
	}
     
  }
	
	
	