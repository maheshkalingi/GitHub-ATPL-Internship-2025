import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FakeAuth {
 isLoggedIn=false;
  login(name:string,password:string){
    if(name=='Mahesh' && password=='Mahesh123')
    this.isLoggedIn=true;
  }

  logout(){
    this.isLoggedIn=false;
  }

}
