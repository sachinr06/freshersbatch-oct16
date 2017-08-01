import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { RouterModule } from '@angular/router'; 
import { homeComponent } from './components/home/home.component';
import { postAdComponent } from './components/postAd/postAd.component';
import { loginComponent } from './components/login/login.component';
import { registerComponent } from './components/register/register.component';
import { navigationComponent } from './components/navigation/navigation.component';
import { HttpModule } from '@angular/http';
@NgModule({
  imports:      [ BrowserModule,FormsModule,ReactiveFormsModule, HttpModule,RouterModule.forRoot([ {path: '', component: homeComponent}, {path: 'postAd', component: postAdComponent} ]) ],
  declarations: [ AppComponent,homeComponent,postAdComponent, navigationComponent,registerComponent, loginComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
