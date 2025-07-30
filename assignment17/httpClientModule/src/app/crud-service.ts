import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Iuser } from './iuser';

@Injectable({
  providedIn: 'root'
})
export class CrudService {

  base_url:string="https://ca1ab72792a0a4eb58d9.free.beeceptor.com/api/users";
  constructor(private http:HttpClient){}

  getData(){
     return this.http.get<Iuser[]>(this.base_url);
  }
  dataDelete(id:number){
   this.http.delete(`${this.base_url}/${id}`);
  }
}
