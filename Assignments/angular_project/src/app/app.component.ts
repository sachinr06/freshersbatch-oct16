import { Component } from '@angular/core';
import { RouterModule } from '@angular/router'; 
import { homeComponent } from './components/home/home.component';
import { postAdComponent } from './components/postAd/postAd.component';
import { loginComponent } from './components/login/login.component';
import { registerComponent } from './components/register/register.component';
import { navigationComponent } from './components/navigation/navigation.component';
import{ registerService} from './services/register/register.service'
@Component({
  selector: 'my-app',
  template: `<header><h1>QUIKER INDIA</h1></header>


<router-outlet></router-outlet>










               <footer>
	  <div class="row">
	  <div class="col-sm-4"></div>
	  <div class="col-sm-4"></div>
	  <div class="col-sm-4"> </div>
	  </div>
</footer>   `,
providers: [registerService] 
})
export class AppComponent  { 

 constructor( registerService: registerService)
{

}
 }
