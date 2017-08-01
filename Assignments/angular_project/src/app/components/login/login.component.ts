import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { RouterModule } from '@angular/router'; 
import{ registerService} from '../../services/register/register.service'
@Component({
  selector: 'login',
  templateUrl:'./login.html'
})

export class loginComponent{
 constructor( private registerService: registerService) {
   }

loginuser(unameRef:string,passRef:string)
{
    let  log:any;
    let user:any;
    let loggeduser:any;
      user ={
                  
                    uname:unameRef,
                    password:passRef
                
         }
    log=this.registerService.enteruser(user);
   log.subscribe((data:any)=> {
       console.log(data) ;
       loggeduser=data.data;
        console.log('NEW USER DETAILS ', loggeduser) });
     
       /* if(loggeduser['auth-token'] == null)
        {
            alert("Login Unsuccessfull ")
        }
        else
        {
             alert("Login successfull ")
        }
*/
    

}

}