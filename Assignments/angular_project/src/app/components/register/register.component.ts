import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { RouterModule } from '@angular/router'; 
import{ registerService} from '../../services/register/register.service'
@Component({
  selector: 'register',
  templateUrl:'./register.html'
})

export class registerComponent{

   constructor( private registerService: registerService) {
   }
 showSuccess=true;
 showError=true;

registeruser(fnameRef:string,lnameRef:string,unameRef:string,passRef:string,emailRef:string,phoneRef:number)
{
    let reg:any;
    let user:any;
    let reguser:any;
      user ={
                   fname:fnameRef,
                    lname:lnameRef,
                    uname:unameRef,
                    password:passRef,
                    email:emailRef,
                    phone:phoneRef
                   
                    
      }
    reg=this.registerService.createuser(user);


   reg.subscribe(
       (response:any)=> { 
            this.showSuccess=false;
           this. showError=true;
           console.log(reg);
       },
    //    reguser=data;
    //     console.log('NEW USER DETAILS ', reguser) }
    
    
     (error:any)=> {
            this.showSuccess=true;
           this. showError=false;

 });


}

  

}