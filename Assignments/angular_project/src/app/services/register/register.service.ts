import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions,Response } from '@angular/http';
import 'rxjs/add/operator/map';
@Injectable() 

export class registerService { 
     constructor(private _http: Http) {
         

      }


    createuser(user:any) {
        let url = "http://192.168.3.144:9000/register"; 
        let headers = new Headers();
        headers.append('Content-Type', 'application/json');

        let options = new RequestOptions({ headers: headers });
        let jsonReq = {
                        "firstName":user.fname,
                        "lastName": user.lname,
                        "userName": user.uname,
                        "password": user.password,
                        "email": user.email,
                        "phone": user.phone
                         };
        return this._http.post(url, jsonReq, options).map((response: Response)=>response.json());

    }


    enteruser(user:any){
             let url = "http://192.168.3.144:9000/login"; 
        let headers = new Headers();
        headers.append('Content-Type', 'application/json');
        
        let options = new RequestOptions({ headers: headers });
         let jsonReq = {
               "userName": user.uname,
                        "password": user.password
         }

          return this._http.post(url, jsonReq, options).map((response: Response)=>response.json());

    }
}